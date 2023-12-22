package Windows.Gaming.Input.Custom

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameControllerProvider.ABI::class)
@Signature("{e6d73982-2996-4559-b16c-3e57d46e58d6}")
@Guid("e6d7398229964559b16c3e57d46e58d6")
@WinRTInterface("e6d7398229964559b16c3e57d46e58d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameControllerProvider.ByReference::class)
public interface IGameControllerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FirmwareVersionInfo(): GameControllerVersionInfo?

  @InterfaceMethod(1)
  public fun get_HardwareProductId(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_HardwareVendorId(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_HardwareVersionInfo(): GameControllerVersionInfo?

  @InterfaceMethod(4)
  public fun get_IsConnected(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameControllerProvider> {
    public override fun getValue() = ABI.makeIGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IGameControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameControllerProvider {
    public val __314032447_Ptr: Pointer?

    public val _314032447_VtblPtr: Pointer?
      get() = __314032447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FirmwareVersionInfo(): GameControllerVersionInfo? {
      val fnPtr = _314032447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerVersionInfo>()
      val hr = fn.invokeHR(arrayOf(__314032447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerVersionInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HardwareProductId(): WinDef.USHORT {
      val fnPtr = _314032447_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__314032447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HardwareVendorId(): WinDef.USHORT {
      val fnPtr = _314032447_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__314032447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_HardwareVersionInfo(): GameControllerVersionInfo? {
      val fnPtr = _314032447_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerVersionInfo>()
      val hr = fn.invokeHR(arrayOf(__314032447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerVersionInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _314032447_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__314032447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGameControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __314032447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6d7398229964559b16c3e57d46e58d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameControllerProvider(ptr: Pointer?): WithDefault =
        IGameControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameControllerProvider {
      val address = segment.toRawLongValue()
      return makeIGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__314032447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameControllerProvider): Array<IGameControllerProvider?>
        = (elements as
        Array<IGameControllerProvider?>).castToImpl<IGameControllerProvider,IGameControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameControllerProvider?> =
        arrayOfNulls<IGameControllerProvider_Impl>(size) as Array<IGameControllerProvider?>
  }
}
