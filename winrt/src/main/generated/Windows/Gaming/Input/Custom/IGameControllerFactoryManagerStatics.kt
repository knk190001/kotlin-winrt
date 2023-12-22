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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameControllerFactoryManagerStatics.ABI::class)
@Signature("{36cb66e3-d0a1-4986-a24c-40b137deba9e}")
@Guid("36cb66e3d0a14986a24c40b137deba9e")
@WinRTInterface("36cb66e3d0a14986a24c40b137deba9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameControllerFactoryManagerStatics.ByReference::class)
public interface IGameControllerFactoryManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterCustomFactoryForGipInterface(factory: ICustomGameControllerFactory?,
      interfaceId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(1)
  public fun RegisterCustomFactoryForHardwareId(
    factory: ICustomGameControllerFactory?,
    hardwareVendorId: WinDef.USHORT,
    hardwareProductId: WinDef.USHORT
  ): Unit

  @InterfaceMethod(2)
  public fun RegisterCustomFactoryForXusbType(
    factory: ICustomGameControllerFactory?,
    xusbType: XusbDeviceType?,
    xusbSubtype: XusbDeviceSubtype?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameControllerFactoryManagerStatics> {
    public override fun getValue() =
        ABI.makeIGameControllerFactoryManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IGameControllerFactoryManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameControllerFactoryManagerStatics {
    public val __1140198796_Ptr: Pointer?

    public val _1140198796_VtblPtr: Pointer?
      get() = __1140198796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterCustomFactoryForGipInterface(factory: ICustomGameControllerFactory?,
        interfaceId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1140198796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140198796_Ptr, marshalToNative(factory),
          marshalToNative(interfaceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RegisterCustomFactoryForHardwareId(
      factory: ICustomGameControllerFactory?,
      hardwareVendorId: WinDef.USHORT,
      hardwareProductId: WinDef.USHORT
    ): Unit {
      val fnPtr = _1140198796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140198796_Ptr, marshalToNative(factory), hardwareVendorId,
          hardwareProductId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RegisterCustomFactoryForXusbType(
      factory: ICustomGameControllerFactory?,
      xusbType: XusbDeviceType?,
      xusbSubtype: XusbDeviceSubtype?
    ): Unit {
      val fnPtr = _1140198796_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140198796_Ptr, marshalToNative(factory),
          marshalToNative(xusbType), marshalToNative(xusbSubtype),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameControllerFactoryManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1140198796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameControllerFactoryManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36cb66e3d0a14986a24c40b137deba9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameControllerFactoryManagerStatics(ptr: Pointer?): WithDefault =
        IGameControllerFactoryManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameControllerFactoryManagerStatics {
      val address = segment.toRawLongValue()
      return makeIGameControllerFactoryManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameControllerFactoryManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1140198796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameControllerFactoryManagerStatics):
        Array<IGameControllerFactoryManagerStatics?> = (elements as
        Array<IGameControllerFactoryManagerStatics?>).castToImpl<IGameControllerFactoryManagerStatics,IGameControllerFactoryManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameControllerFactoryManagerStatics?> =
        arrayOfNulls<IGameControllerFactoryManagerStatics_Impl>(size) as
        Array<IGameControllerFactoryManagerStatics?>
  }
}
