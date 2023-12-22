package Windows.System.Preview

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

@ABIMarker(ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ABI::class)
@Signature("{2d2d1bc6-02ce-474a-a556-a75b1cf93a03}")
@Guid("2d2d1bc602ce474aa556a75b1cf93a03")
@WinRTInterface("2d2d1bc602ce474aa556a75b1cf93a03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs.ByReference::class)
public interface ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): TwoPanelHingedDevicePosturePreviewReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs {
    public val __789410899_Ptr: Pointer?

    public val _789410899_VtblPtr: Pointer?
      get() = __789410899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): TwoPanelHingedDevicePosturePreviewReading? {
      val fnPtr = _789410899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPanelHingedDevicePosturePreviewReading>()
      val hr = fn.invokeHR(arrayOf(__789410899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<TwoPanelHingedDevicePosturePreviewReading>(result.getValue())
      return resultValue
    }
  }

  public class ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __789410899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d2d1bc602ce474aa556a75b1cf93a03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(ptr: Pointer?):
        WithDefault = ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__789410899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs):
        Array<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs?> = (elements as
        Array<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs?>).castToImpl<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs,ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs?> =
        arrayOfNulls<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs_Impl>(size) as
        Array<ITwoPanelHingedDevicePosturePreviewReadingChangedEventArgs?>
  }
}
