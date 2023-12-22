package Windows.Services.Maps

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

@ABIMarker(IMapServiceStatics4.ABI::class)
@Signature("{088a2862-6abc-420e-945f-4cfd89c67356}")
@Guid("088a28626abc420e945f4cfd89c67356")
@WinRTInterface("088a28626abc420e945f4cfd89c67356")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapServiceStatics4.ByReference::class)
public interface IMapServiceStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DataUsagePreference(value: MapServiceDataUsagePreference?): Unit

  @InterfaceMethod(1)
  public fun get_DataUsagePreference(): MapServiceDataUsagePreference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapServiceStatics4> {
    public override fun getValue() = ABI.makeIMapServiceStatics4(pointer.getPointer(0))

    public fun setValue(value: IMapServiceStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapServiceStatics4 {
    public val __607165109_Ptr: Pointer?

    public val _607165109_VtblPtr: Pointer?
      get() = __607165109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DataUsagePreference(value: MapServiceDataUsagePreference?): Unit {
      val fnPtr = _607165109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__607165109_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DataUsagePreference(): MapServiceDataUsagePreference? {
      val fnPtr = _607165109_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapServiceDataUsagePreference>()
      val hr = fn.invokeHR(arrayOf(__607165109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapServiceDataUsagePreference>(result.getValue())
      return resultValue
    }
  }

  public class IMapServiceStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __607165109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapServiceStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("088a28626abc420e945f4cfd89c67356")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapServiceStatics4(ptr: Pointer?): WithDefault = IMapServiceStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapServiceStatics4 {
      val address = segment.toRawLongValue()
      return makeIMapServiceStatics4(Pointer(address))
    }

    public override fun toNative(obj: IMapServiceStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__607165109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapServiceStatics4): Array<IMapServiceStatics4?> =
        (elements as
        Array<IMapServiceStatics4?>).castToImpl<IMapServiceStatics4,IMapServiceStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapServiceStatics4?> =
        arrayOfNulls<IMapServiceStatics4_Impl>(size) as Array<IMapServiceStatics4?>
  }
}
