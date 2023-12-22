package Windows.Devices.Sensors

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

@ABIMarker(ICompassStatics.ABI::class)
@Signature("{9abc97df-56ec-4c25-b54d-40a68bb5b269}")
@Guid("9abc97df56ec4c25b54d40a68bb5b269")
@WinRTInterface("9abc97df56ec4c25b54d40a68bb5b269")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassStatics.ByReference::class)
public interface ICompassStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): Compass?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassStatics> {
    public override fun getValue() = ABI.makeICompassStatics(pointer.getPointer(0))

    public fun setValue(value: ICompassStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassStatics {
    public val __332372161_Ptr: Pointer?

    public val _332372161_VtblPtr: Pointer?
      get() = __332372161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): Compass? {
      val fnPtr = _332372161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compass>()
      val hr = fn.invokeHR(arrayOf(__332372161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compass>(result.getValue())
      return resultValue
    }
  }

  public class ICompassStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __332372161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9abc97df56ec4c25b54d40a68bb5b269")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassStatics(ptr: Pointer?): WithDefault = ICompassStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassStatics {
      val address = segment.toRawLongValue()
      return makeICompassStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompassStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__332372161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassStatics): Array<ICompassStatics?> = (elements as
        Array<ICompassStatics?>).castToImpl<ICompassStatics,ICompassStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassStatics?> =
        arrayOfNulls<ICompassStatics_Impl>(size) as Array<ICompassStatics?>
  }
}
