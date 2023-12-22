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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapServiceStatics3.ABI::class)
@Signature("{0a11ce20-63a7-4854-b355-d6dcda223d1b}")
@Guid("0a11ce2063a74854b355d6dcda223d1b")
@WinRTInterface("0a11ce2063a74854b355d6dcda223d1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapServiceStatics3.ByReference::class)
public interface IMapServiceStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataAttributions(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapServiceStatics3> {
    public override fun getValue() = ABI.makeIMapServiceStatics3(pointer.getPointer(0))

    public fun setValue(value: IMapServiceStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapServiceStatics3 {
    public val __607165108_Ptr: Pointer?

    public val _607165108_VtblPtr: Pointer?
      get() = __607165108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataAttributions(): String? {
      val fnPtr = _607165108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607165108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMapServiceStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __607165108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapServiceStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a11ce2063a74854b355d6dcda223d1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapServiceStatics3(ptr: Pointer?): WithDefault = IMapServiceStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapServiceStatics3 {
      val address = segment.toRawLongValue()
      return makeIMapServiceStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMapServiceStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__607165108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapServiceStatics3): Array<IMapServiceStatics3?> =
        (elements as
        Array<IMapServiceStatics3?>).castToImpl<IMapServiceStatics3,IMapServiceStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapServiceStatics3?> =
        arrayOfNulls<IMapServiceStatics3_Impl>(size) as Array<IMapServiceStatics3?>
  }
}
