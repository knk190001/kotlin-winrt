package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowChangedEventArgs.ABI::class)
@Signature("{1de1f3be-a655-55ad-b2b6-eb240f880356}")
@Guid("1de1f3bea65555adb2b6eb240f880356")
@WinRTInterface("1de1f3bea65555adb2b6eb240f880356")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowChangedEventArgs.ByReference::class)
public interface IAppWindowChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DidAvailableWindowPresentationsChange(): Boolean

  @InterfaceMethod(1)
  public fun get_DidDisplayRegionsChange(): Boolean

  @InterfaceMethod(2)
  public fun get_DidFrameChange(): Boolean

  @InterfaceMethod(3)
  public fun get_DidSizeChange(): Boolean

  @InterfaceMethod(4)
  public fun get_DidTitleBarChange(): Boolean

  @InterfaceMethod(5)
  public fun get_DidVisibilityChange(): Boolean

  @InterfaceMethod(6)
  public fun get_DidWindowingEnvironmentChange(): Boolean

  @InterfaceMethod(7)
  public fun get_DidWindowPresentationChange(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowChangedEventArgs> {
    public override fun getValue() = ABI.makeIAppWindowChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppWindowChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowChangedEventArgs {
    public val __714238861_Ptr: Pointer?

    public val _714238861_VtblPtr: Pointer?
      get() = __714238861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DidAvailableWindowPresentationsChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DidDisplayRegionsChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DidFrameChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DidSizeChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DidTitleBarChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_DidVisibilityChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_DidWindowingEnvironmentChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_DidWindowPresentationChange(): Boolean {
      val fnPtr = _714238861_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714238861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppWindowChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __714238861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1de1f3bea65555adb2b6eb240f880356")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppWindowChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppWindowChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714238861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowChangedEventArgs):
        Array<IAppWindowChangedEventArgs?> = (elements as
        Array<IAppWindowChangedEventArgs?>).castToImpl<IAppWindowChangedEventArgs,IAppWindowChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowChangedEventArgs?> =
        arrayOfNulls<IAppWindowChangedEventArgs_Impl>(size) as Array<IAppWindowChangedEventArgs?>
  }
}
