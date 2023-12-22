package Windows.Devices.Adc.Provider

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

@ABIMarker(IAdcControllerProvider.ABI::class)
@Signature("{be545828-816d-4de5-a048-aba06958aaa8}")
@Guid("be545828816d4de5a048aba06958aaa8")
@WinRTInterface("be545828816d4de5a048aba06958aaa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcControllerProvider.ByReference::class)
public interface IAdcControllerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChannelCount(): Int

  @InterfaceMethod(1)
  public fun get_ResolutionInBits(): Int

  @InterfaceMethod(2)
  public fun get_MinValue(): Int

  @InterfaceMethod(3)
  public fun get_MaxValue(): Int

  @InterfaceMethod(4)
  public fun get_ChannelMode(): ProviderAdcChannelMode?

  @InterfaceMethod(5)
  public fun put_ChannelMode(value: ProviderAdcChannelMode?): Unit

  @InterfaceMethod(6)
  public fun IsChannelModeSupported(channelMode: ProviderAdcChannelMode?): Boolean

  @InterfaceMethod(7)
  public fun AcquireChannel(channel: Int): Unit

  @InterfaceMethod(8)
  public fun ReleaseChannel(channel: Int): Unit

  @InterfaceMethod(9)
  public fun ReadValue(channelNumber: Int): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdcControllerProvider> {
    public override fun getValue() = ABI.makeIAdcControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IAdcControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcControllerProvider {
    public val __582206303_Ptr: Pointer?

    public val _582206303_VtblPtr: Pointer?
      get() = __582206303_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChannelCount(): Int {
      val fnPtr = _582206303_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ResolutionInBits(): Int {
      val fnPtr = _582206303_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MinValue(): Int {
      val fnPtr = _582206303_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxValue(): Int {
      val fnPtr = _582206303_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ChannelMode(): ProviderAdcChannelMode? {
      val fnPtr = _582206303_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderAdcChannelMode>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderAdcChannelMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ChannelMode(value: ProviderAdcChannelMode?): Unit {
      val fnPtr = _582206303_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun IsChannelModeSupported(channelMode: ProviderAdcChannelMode?): Boolean {
      val fnPtr = _582206303_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr, marshalToNative(channelMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun AcquireChannel(channel: Int): Unit {
      val fnPtr = _582206303_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr, channel,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ReleaseChannel(channel: Int): Unit {
      val fnPtr = _582206303_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr, channel,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun ReadValue(channelNumber: Int): Int {
      val fnPtr = _582206303_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__582206303_Ptr, channelNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAdcControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __582206303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be545828816d4de5a048aba06958aaa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcControllerProvider(ptr: Pointer?): WithDefault =
        IAdcControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcControllerProvider {
      val address = segment.toRawLongValue()
      return makeIAdcControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IAdcControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__582206303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcControllerProvider): Array<IAdcControllerProvider?> =
        (elements as
        Array<IAdcControllerProvider?>).castToImpl<IAdcControllerProvider,IAdcControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcControllerProvider?> =
        arrayOfNulls<IAdcControllerProvider_Impl>(size) as Array<IAdcControllerProvider?>
  }
}
