package Windows.ApplicationModel.DataTransfer.ShareTarget

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShareOperation2.ABI::class)
@Signature("{0ffb97c1-9778-4a09-8e5b-cb5e482d0555}")
@Guid("0ffb97c197784a098e5bcb5e482d0555")
@WinRTInterface("0ffb97c197784a098e5bcb5e482d0555")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareOperation2.ByReference::class)
public interface IShareOperation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DismissUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareOperation2> {
    public override fun getValue() = ABI.makeIShareOperation2(pointer.getPointer(0))

    public fun setValue(value: IShareOperation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareOperation2 {
    public val __480746078_Ptr: Pointer?

    public val _480746078_VtblPtr: Pointer?
      get() = __480746078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DismissUI(): Unit {
      val fnPtr = _480746078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__480746078_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareOperation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __480746078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareOperation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ffb97c197784a098e5bcb5e482d0555")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareOperation2(ptr: Pointer?): WithDefault = IShareOperation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareOperation2 {
      val address = segment.toRawLongValue()
      return makeIShareOperation2(Pointer(address))
    }

    public override fun toNative(obj: IShareOperation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__480746078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareOperation2): Array<IShareOperation2?> = (elements as
        Array<IShareOperation2?>).castToImpl<IShareOperation2,IShareOperation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareOperation2?> =
        arrayOfNulls<IShareOperation2_Impl>(size) as Array<IShareOperation2?>
  }
}
