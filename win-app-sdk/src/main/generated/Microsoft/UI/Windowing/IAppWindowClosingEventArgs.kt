package Microsoft.UI.Windowing

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppWindowClosingEventArgs.ABI::class)
@Signature("{0e09d90b-2261-590b-9ad1-8504991d8754}")
@Guid("0e09d90b2261590b9ad18504991d8754")
@WinRTInterface("0e09d90b2261590b9ad18504991d8754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowClosingEventArgs.ByReference::class)
public interface IAppWindowClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowClosingEventArgs> {
    public override fun getValue() = ABI.makeIAppWindowClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppWindowClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowClosingEventArgs {
    public val __1537881406_Ptr: Pointer?

    public val _1537881406_VtblPtr: Pointer?
      get() = __1537881406_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1537881406_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1537881406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1537881406_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1537881406_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindowClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1537881406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e09d90b2261590b9ad18504991d8754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowClosingEventArgs(ptr: Pointer?): WithDefault =
        IAppWindowClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppWindowClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1537881406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowClosingEventArgs):
        Array<IAppWindowClosingEventArgs?> = (elements as
        Array<IAppWindowClosingEventArgs?>).castToImpl<IAppWindowClosingEventArgs,IAppWindowClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowClosingEventArgs?> =
        arrayOfNulls<IAppWindowClosingEventArgs_Impl>(size) as Array<IAppWindowClosingEventArgs?>
  }
}
