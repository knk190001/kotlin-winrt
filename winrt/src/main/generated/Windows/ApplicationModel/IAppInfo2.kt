package Windows.ApplicationModel

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

@ABIMarker(IAppInfo2.ABI::class)
@Signature("{be4b1f5a-2098-431b-bd25-b30878748d47}")
@Guid("be4b1f5a2098431bbd25b30878748d47")
@WinRTInterface("be4b1f5a2098431bbd25b30878748d47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInfo2.ByReference::class)
public interface IAppInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Package(): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppInfo2> {
    public override fun getValue() = ABI.makeIAppInfo2(pointer.getPointer(0))

    public fun setValue(value: IAppInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInfo2 {
    public val __856011896_Ptr: Pointer?

    public val _856011896_VtblPtr: Pointer?
      get() = __856011896_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Package(): Package? {
      val fnPtr = _856011896_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__856011896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IAppInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856011896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be4b1f5a2098431bbd25b30878748d47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInfo2(ptr: Pointer?): WithDefault = IAppInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInfo2 {
      val address = segment.toRawLongValue()
      return makeIAppInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAppInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856011896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo2): Array<IAppInfo2?> = (elements as
        Array<IAppInfo2?>).castToImpl<IAppInfo2,IAppInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo2?> = arrayOfNulls<IAppInfo2_Impl>(size)
        as Array<IAppInfo2?>
  }
}
