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

@ABIMarker(IConnectionCost.ABI::class)
@Signature("{bad7d829-3416-4b10-a202-bac0b075bdae}")
@Guid("bad7d82934164b10a202bac0b075bdae")
@WinRTInterface("bad7d82934164b10a202bac0b075bdae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionCost.ByReference::class)
public interface IConnectionCost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkCostType(): NetworkCostType?

  @InterfaceMethod(1)
  public fun get_Roaming(): Boolean

  @InterfaceMethod(2)
  public fun get_OverDataLimit(): Boolean

  @InterfaceMethod(3)
  public fun get_ApproachingDataLimit(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionCost> {
    public override fun getValue() = ABI.makeIConnectionCost(pointer.getPointer(0))

    public fun setValue(value: IConnectionCost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionCost {
    public val __545415218_Ptr: Pointer?

    public val _545415218_VtblPtr: Pointer?
      get() = __545415218_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkCostType(): NetworkCostType? {
      val fnPtr = _545415218_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkCostType>()
      val hr = fn.invokeHR(arrayOf(__545415218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkCostType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Roaming(): Boolean {
      val fnPtr = _545415218_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__545415218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OverDataLimit(): Boolean {
      val fnPtr = _545415218_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__545415218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ApproachingDataLimit(): Boolean {
      val fnPtr = _545415218_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__545415218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IConnectionCost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545415218_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionCost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bad7d82934164b10a202bac0b075bdae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionCost(ptr: Pointer?): WithDefault = IConnectionCost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionCost {
      val address = segment.toRawLongValue()
      return makeIConnectionCost(Pointer(address))
    }

    public override fun toNative(obj: IConnectionCost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545415218_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionCost): Array<IConnectionCost?> = (elements as
        Array<IConnectionCost?>).castToImpl<IConnectionCost,IConnectionCost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionCost?> =
        arrayOfNulls<IConnectionCost_Impl>(size) as Array<IConnectionCost?>
  }
}
