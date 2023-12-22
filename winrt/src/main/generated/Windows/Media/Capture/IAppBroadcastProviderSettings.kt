package Windows.Media.Capture

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastProviderSettings.ABI::class)
@Signature("{c30bdf62-9948-458f-ad50-aa06ec03da08}")
@Guid("c30bdf629948458fad50aa06ec03da08")
@WinRTInterface("c30bdf629948458fad50aa06ec03da08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastProviderSettings.ByReference::class)
public interface IAppBroadcastProviderSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DefaultBroadcastTitle(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DefaultBroadcastTitle(): String?

  @InterfaceMethod(2)
  public fun put_AudioEncodingBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_AudioEncodingBitrate(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_CustomVideoEncodingBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_CustomVideoEncodingBitrate(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_CustomVideoEncodingHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_CustomVideoEncodingHeight(): WinDef.UINT

  @InterfaceMethod(8)
  public fun put_CustomVideoEncodingWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(9)
  public fun get_CustomVideoEncodingWidth(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_VideoEncodingBitrateMode(value: AppBroadcastVideoEncodingBitrateMode?): Unit

  @InterfaceMethod(11)
  public fun get_VideoEncodingBitrateMode(): AppBroadcastVideoEncodingBitrateMode?

  @InterfaceMethod(12)
  public fun put_VideoEncodingResolutionMode(value: AppBroadcastVideoEncodingResolutionMode?): Unit

  @InterfaceMethod(13)
  public fun get_VideoEncodingResolutionMode(): AppBroadcastVideoEncodingResolutionMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastProviderSettings> {
    public override fun getValue() = ABI.makeIAppBroadcastProviderSettings(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastProviderSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastProviderSettings {
    public val __1102757068_Ptr: Pointer?

    public val _1102757068_VtblPtr: Pointer?
      get() = __1102757068_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DefaultBroadcastTitle(value: String?): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DefaultBroadcastTitle(): String? {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AudioEncodingBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AudioEncodingBitrate(): WinDef.UINT {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_CustomVideoEncodingBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CustomVideoEncodingBitrate(): WinDef.UINT {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CustomVideoEncodingHeight(value: WinDef.UINT): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_CustomVideoEncodingHeight(): WinDef.UINT {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_CustomVideoEncodingWidth(value: WinDef.UINT): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_CustomVideoEncodingWidth(): WinDef.UINT {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_VideoEncodingBitrateMode(value: AppBroadcastVideoEncodingBitrateMode?):
        Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_VideoEncodingBitrateMode(): AppBroadcastVideoEncodingBitrateMode? {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastVideoEncodingBitrateMode>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastVideoEncodingBitrateMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override
        fun put_VideoEncodingResolutionMode(value: AppBroadcastVideoEncodingResolutionMode?): Unit {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_VideoEncodingResolutionMode():
        AppBroadcastVideoEncodingResolutionMode? {
      val fnPtr = _1102757068_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastVideoEncodingResolutionMode>()
      val hr = fn.invokeHR(arrayOf(__1102757068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppBroadcastVideoEncodingResolutionMode>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastProviderSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1102757068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastProviderSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c30bdf629948458fad50aa06ec03da08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastProviderSettings(ptr: Pointer?): WithDefault =
        IAppBroadcastProviderSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastProviderSettings {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastProviderSettings(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastProviderSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1102757068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastProviderSettings):
        Array<IAppBroadcastProviderSettings?> = (elements as
        Array<IAppBroadcastProviderSettings?>).castToImpl<IAppBroadcastProviderSettings,IAppBroadcastProviderSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastProviderSettings?> =
        arrayOfNulls<IAppBroadcastProviderSettings_Impl>(size) as
        Array<IAppBroadcastProviderSettings?>
  }
}
