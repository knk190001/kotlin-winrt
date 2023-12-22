package Windows.System.Diagnostics

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

@ABIMarker(ISystemMemoryUsage.ABI::class)
@Signature("{17ffc595-1702-49cf-aa27-2f0a32591404}")
@Guid("17ffc595170249cfaa272f0a32591404")
@WinRTInterface("17ffc595170249cfaa272f0a32591404")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMemoryUsage.ByReference::class)
public interface ISystemMemoryUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetReport(): SystemMemoryUsageReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMemoryUsage> {
    public override fun getValue() = ABI.makeISystemMemoryUsage(pointer.getPointer(0))

    public fun setValue(value: ISystemMemoryUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMemoryUsage {
    public val __1295227392_Ptr: Pointer?

    public val _1295227392_VtblPtr: Pointer?
      get() = __1295227392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetReport(): SystemMemoryUsageReport? {
      val fnPtr = _1295227392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMemoryUsageReport>()
      val hr = fn.invokeHR(arrayOf(__1295227392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMemoryUsageReport>(result.getValue())
      return resultValue
    }
  }

  public class ISystemMemoryUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1295227392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMemoryUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17ffc595170249cfaa272f0a32591404")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMemoryUsage(ptr: Pointer?): WithDefault = ISystemMemoryUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMemoryUsage {
      val address = segment.toRawLongValue()
      return makeISystemMemoryUsage(Pointer(address))
    }

    public override fun toNative(obj: ISystemMemoryUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1295227392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMemoryUsage): Array<ISystemMemoryUsage?> =
        (elements as
        Array<ISystemMemoryUsage?>).castToImpl<ISystemMemoryUsage,ISystemMemoryUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMemoryUsage?> =
        arrayOfNulls<ISystemMemoryUsage_Impl>(size) as Array<ISystemMemoryUsage?>
  }
}
