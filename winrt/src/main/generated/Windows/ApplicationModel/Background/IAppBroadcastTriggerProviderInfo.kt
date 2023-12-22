package Windows.ApplicationModel.Background

import Windows.Foundation.TimeSpan
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

@ABIMarker(IAppBroadcastTriggerProviderInfo.ABI::class)
@Signature("{f219352d-9de8-4420-9ce2-5eff8f17376b}")
@Guid("f219352d9de844209ce25eff8f17376b")
@WinRTInterface("f219352d9de844209ce25eff8f17376b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastTriggerProviderInfo.ByReference::class)
public interface IAppBroadcastTriggerProviderInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DisplayNameResource(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DisplayNameResource(): String?

  @InterfaceMethod(2)
  public fun put_LogoResource(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_LogoResource(): String?

  @InterfaceMethod(4)
  public fun put_VideoKeyFrameInterval(value: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_VideoKeyFrameInterval(): TimeSpan?

  @InterfaceMethod(6)
  public fun put_MaxVideoBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_MaxVideoBitrate(): WinDef.UINT

  @InterfaceMethod(8)
  public fun put_MaxVideoWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(9)
  public fun get_MaxVideoWidth(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_MaxVideoHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_MaxVideoHeight(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastTriggerProviderInfo> {
    public override fun getValue() = ABI.makeIAppBroadcastTriggerProviderInfo(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastTriggerProviderInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastTriggerProviderInfo {
    public val __1353609146_Ptr: Pointer?

    public val _1353609146_VtblPtr: Pointer?
      get() = __1353609146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DisplayNameResource(value: String?): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DisplayNameResource(): String? {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_LogoResource(value: String?): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LogoResource(): String? {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_VideoKeyFrameInterval(value: TimeSpan?): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_VideoKeyFrameInterval(): TimeSpan? {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_MaxVideoBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_MaxVideoBitrate(): WinDef.UINT {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_MaxVideoWidth(value: WinDef.UINT): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_MaxVideoWidth(): WinDef.UINT {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_MaxVideoHeight(value: WinDef.UINT): Unit {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_MaxVideoHeight(): WinDef.UINT {
      val fnPtr = _1353609146_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1353609146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastTriggerProviderInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1353609146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastTriggerProviderInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f219352d9de844209ce25eff8f17376b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastTriggerProviderInfo(ptr: Pointer?): WithDefault =
        IAppBroadcastTriggerProviderInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastTriggerProviderInfo {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastTriggerProviderInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastTriggerProviderInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1353609146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastTriggerProviderInfo):
        Array<IAppBroadcastTriggerProviderInfo?> = (elements as
        Array<IAppBroadcastTriggerProviderInfo?>).castToImpl<IAppBroadcastTriggerProviderInfo,IAppBroadcastTriggerProviderInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastTriggerProviderInfo?> =
        arrayOfNulls<IAppBroadcastTriggerProviderInfo_Impl>(size) as
        Array<IAppBroadcastTriggerProviderInfo?>
  }
}
