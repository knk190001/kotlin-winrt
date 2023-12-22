package Windows.Media.Devices

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IAudioDeviceModule.ABI::class)
@Signature("{86cfac36-47c1-4b33-9852-8773ec4be123}")
@Guid("86cfac3647c14b3398528773ec4be123")
@WinRTInterface("86cfac3647c14b3398528773ec4be123")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioDeviceModule.ByReference::class)
public interface IAudioDeviceModule : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClassId(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_InstanceId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_MajorVersion(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_MinorVersion(): WinDef.UINT

  @InterfaceMethod(5)
  public fun SendCommandAsync(Command: IBuffer?): IAsyncOperation<ModuleCommandResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioDeviceModule> {
    public override fun getValue() = ABI.makeIAudioDeviceModule(pointer.getPointer(0))

    public fun setValue(value: IAudioDeviceModule_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioDeviceModule {
    public val __1162343337_Ptr: Pointer?

    public val _1162343337_VtblPtr: Pointer?
      get() = __1162343337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClassId(): String? {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InstanceId(): WinDef.UINT {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MajorVersion(): WinDef.UINT {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MinorVersion(): WinDef.UINT {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SendCommandAsync(Command: IBuffer?):
        IAsyncOperation<ModuleCommandResult?>? {
      val fnPtr = _1162343337_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ModuleCommandResult?>>()
      val hr = fn.invokeHR(arrayOf(__1162343337_Ptr, marshalToNative(Command), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ModuleCommandResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioDeviceModule_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1162343337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioDeviceModule, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86cfac3647c14b3398528773ec4be123")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioDeviceModule(ptr: Pointer?): WithDefault = IAudioDeviceModule_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioDeviceModule {
      val address = segment.toRawLongValue()
      return makeIAudioDeviceModule(Pointer(address))
    }

    public override fun toNative(obj: IAudioDeviceModule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1162343337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioDeviceModule): Array<IAudioDeviceModule?> =
        (elements as
        Array<IAudioDeviceModule?>).castToImpl<IAudioDeviceModule,IAudioDeviceModule_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioDeviceModule?> =
        arrayOfNulls<IAudioDeviceModule_Impl>(size) as Array<IAudioDeviceModule?>
  }
}
