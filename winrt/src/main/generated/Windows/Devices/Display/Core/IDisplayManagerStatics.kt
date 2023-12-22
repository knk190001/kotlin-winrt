package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayManagerStatics.ABI::class)
@Signature("{2b6b9446-b999-5535-9d69-53f092c780a1}")
@Guid("2b6b9446b99955359d6953f092c780a1")
@WinRTInterface("2b6b9446b99955359d6953f092c780a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManagerStatics.ByReference::class)
public interface IDisplayManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(options: DisplayManagerOptions?): DisplayManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManagerStatics> {
    public override fun getValue() = ABI.makeIDisplayManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManagerStatics {
    public val __2023923320_Ptr: Pointer?

    public val _2023923320_VtblPtr: Pointer?
      get() = __2023923320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(options: DisplayManagerOptions?): DisplayManager? {
      val fnPtr = _2023923320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManager>()
      val hr = fn.invokeHR(arrayOf(__2023923320_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManager>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023923320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b6b9446b99955359d6953f092c780a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManagerStatics(ptr: Pointer?): WithDefault =
        IDisplayManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayManagerStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023923320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManagerStatics): Array<IDisplayManagerStatics?> =
        (elements as
        Array<IDisplayManagerStatics?>).castToImpl<IDisplayManagerStatics,IDisplayManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManagerStatics?> =
        arrayOfNulls<IDisplayManagerStatics_Impl>(size) as Array<IDisplayManagerStatics?>
  }
}
