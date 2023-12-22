package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.IGameController
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICustomGameControllerFactory.ABI::class)
@Signature("{69a0ae5e-758e-4cbe-ace6-62155fe9126f}")
@Guid("69a0ae5e758e4cbeace662155fe9126f")
@WinRTInterface("69a0ae5e758e4cbeace662155fe9126f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomGameControllerFactory.ByReference::class)
public interface ICustomGameControllerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateGameController(provider: IGameControllerProvider?): IUnknown?

  @InterfaceMethod(1)
  public fun OnGameControllerAdded(value: IGameController?): Unit

  @InterfaceMethod(2)
  public fun OnGameControllerRemoved(value: IGameController?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomGameControllerFactory> {
    public override fun getValue() = ABI.makeICustomGameControllerFactory(pointer.getPointer(0))

    public fun setValue(value: ICustomGameControllerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomGameControllerFactory {
    public val __1656039157_Ptr: Pointer?

    public val _1656039157_VtblPtr: Pointer?
      get() = __1656039157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateGameController(provider: IGameControllerProvider?): IUnknown? {
      val fnPtr = _1656039157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1656039157_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnGameControllerAdded(value: IGameController?): Unit {
      val fnPtr = _1656039157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656039157_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnGameControllerRemoved(value: IGameController?): Unit {
      val fnPtr = _1656039157_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656039157_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICustomGameControllerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1656039157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomGameControllerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69a0ae5e758e4cbeace662155fe9126f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomGameControllerFactory(ptr: Pointer?): WithDefault =
        ICustomGameControllerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomGameControllerFactory {
      val address = segment.toRawLongValue()
      return makeICustomGameControllerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICustomGameControllerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656039157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomGameControllerFactory):
        Array<ICustomGameControllerFactory?> = (elements as
        Array<ICustomGameControllerFactory?>).castToImpl<ICustomGameControllerFactory,ICustomGameControllerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomGameControllerFactory?> =
        arrayOfNulls<ICustomGameControllerFactory_Impl>(size) as
        Array<ICustomGameControllerFactory?>
  }
}
