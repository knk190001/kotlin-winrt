package Windows.UI.Xaml

import Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs
import Windows.ApplicationModel.Activation.FileActivatedEventArgs
import Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs
import Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.LaunchActivatedEventArgs
import Windows.ApplicationModel.Activation.SearchActivatedEventArgs
import Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs
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

@ABIMarker(IApplicationOverrides.ABI::class)
@Signature("{25f99ff7-9347-459a-9fac-b2d0e11c1a0f}")
@Guid("25f99ff79347459a9facb2d0e11c1a0f")
@WinRTInterface("25f99ff79347459a9facb2d0e11c1a0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationOverrides.ByReference::class)
public interface IApplicationOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnActivated(args: IActivatedEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnLaunched(args: LaunchActivatedEventArgs?): Unit

  @InterfaceMethod(2)
  public fun OnFileActivated(args: FileActivatedEventArgs?): Unit

  @InterfaceMethod(3)
  public fun OnSearchActivated(args: SearchActivatedEventArgs?): Unit

  @InterfaceMethod(4)
  public fun OnShareTargetActivated(args: ShareTargetActivatedEventArgs?): Unit

  @InterfaceMethod(5)
  public fun OnFileOpenPickerActivated(args: FileOpenPickerActivatedEventArgs?): Unit

  @InterfaceMethod(6)
  public fun OnFileSavePickerActivated(args: FileSavePickerActivatedEventArgs?): Unit

  @InterfaceMethod(7)
  public fun OnCachedFileUpdaterActivated(args: CachedFileUpdaterActivatedEventArgs?): Unit

  @InterfaceMethod(8)
  public fun OnWindowCreated(args: WindowCreatedEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationOverrides> {
    public override fun getValue() = ABI.makeIApplicationOverrides(pointer.getPointer(0))

    public fun setValue(value: IApplicationOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationOverrides {
    public val __758195191_Ptr: Pointer?

    public val _758195191_VtblPtr: Pointer?
      get() = __758195191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnActivated(args: IActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnLaunched(args: LaunchActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnFileActivated(args: FileActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnSearchActivated(args: SearchActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OnShareTargetActivated(args: ShareTargetActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnFileOpenPickerActivated(args: FileOpenPickerActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun OnFileSavePickerActivated(args: FileSavePickerActivatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun OnCachedFileUpdaterActivated(args: CachedFileUpdaterActivatedEventArgs?):
        Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun OnWindowCreated(args: WindowCreatedEventArgs?): Unit {
      val fnPtr = _758195191_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__758195191_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __758195191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25f99ff79347459a9facb2d0e11c1a0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationOverrides(ptr: Pointer?): WithDefault =
        IApplicationOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationOverrides {
      val address = segment.toRawLongValue()
      return makeIApplicationOverrides(Pointer(address))
    }

    public override fun toNative(obj: IApplicationOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__758195191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationOverrides): Array<IApplicationOverrides?> =
        (elements as
        Array<IApplicationOverrides?>).castToImpl<IApplicationOverrides,IApplicationOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationOverrides?> =
        arrayOfNulls<IApplicationOverrides_Impl>(size) as Array<IApplicationOverrides?>
  }
}
