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

@ABIMarker(IMapServiceStatics.ABI::class)
@Signature("{0144ad85-c04c-4cdd-871a-a0726d097cd4}")
@Guid("0144ad85c04c4cdd871aa0726d097cd4")
@WinRTInterface("0144ad85c04c4cdd871aa0726d097cd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapServiceStatics.ByReference::class)
public interface IMapServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ServiceToken(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_ServiceToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapServiceStatics> {
    public override fun getValue() = ABI.makeIMapServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IMapServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapServiceStatics {
    public val __1543606623_Ptr: Pointer?

    public val _1543606623_VtblPtr: Pointer?
      get() = __1543606623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ServiceToken(value: String?): Unit {
      val fnPtr = _1543606623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1543606623_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ServiceToken(): String? {
      val fnPtr = _1543606623_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1543606623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMapServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1543606623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0144ad85c04c4cdd871aa0726d097cd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapServiceStatics(ptr: Pointer?): WithDefault = IMapServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapServiceStatics {
      val address = segment.toRawLongValue()
      return makeIMapServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1543606623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapServiceStatics): Array<IMapServiceStatics?> =
        (elements as
        Array<IMapServiceStatics?>).castToImpl<IMapServiceStatics,IMapServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapServiceStatics?> =
        arrayOfNulls<IMapServiceStatics_Impl>(size) as Array<IMapServiceStatics?>
  }
}
