package Windows.Networking.Connectivity

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionCost2.ABI::class)
@Signature("{8e113a05-e209-4549-bb25-5e0db691cb05}")
@Guid("8e113a05e2094549bb255e0db691cb05")
@WinRTInterface("8e113a05e2094549bb255e0db691cb05")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionCost2.ByReference::class)
public interface IConnectionCost2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundDataUsageRestricted(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionCost2> {
    public override fun getValue() = ABI.makeIConnectionCost2(pointer.getPointer(0))

    public fun setValue(value: IConnectionCost2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionCost2 {
    public val __271997476_Ptr: Pointer?

    public val _271997476_VtblPtr: Pointer?
      get() = __271997476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundDataUsageRestricted(): Boolean {
      val fnPtr = _271997476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__271997476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IConnectionCost2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __271997476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionCost2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e113a05e2094549bb255e0db691cb05")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionCost2(ptr: Pointer?): WithDefault = IConnectionCost2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionCost2 {
      val address = segment.toRawLongValue()
      return makeIConnectionCost2(Pointer(address))
    }

    public override fun toNative(obj: IConnectionCost2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__271997476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionCost2): Array<IConnectionCost2?> = (elements as
        Array<IConnectionCost2?>).castToImpl<IConnectionCost2,IConnectionCost2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionCost2?> =
        arrayOfNulls<IConnectionCost2_Impl>(size) as Array<IConnectionCost2?>
  }
}
