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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRoute2.ABI::class)
@Signature("{d1c5d40c-2213-4ab0-a260-46b38169beac}")
@Guid("d1c5d40c22134ab0a26046b38169beac")
@WinRTInterface("d1c5d40c22134ab0a26046b38169beac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRoute2.ByReference::class)
public interface IMapRoute2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViolatedRestrictions(): MapRouteRestrictions?

  @InterfaceMethod(1)
  public fun get_HasBlockedRoads(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRoute2> {
    public override fun getValue() = ABI.makeIMapRoute2(pointer.getPointer(0))

    public fun setValue(value: IMapRoute2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRoute2 {
    public val __1501242344_Ptr: Pointer?

    public val _1501242344_VtblPtr: Pointer?
      get() = __1501242344_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViolatedRestrictions(): MapRouteRestrictions? {
      val fnPtr = _1501242344_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteRestrictions>()
      val hr = fn.invokeHR(arrayOf(__1501242344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteRestrictions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasBlockedRoads(): Boolean {
      val fnPtr = _1501242344_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1501242344_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapRoute2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1501242344_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRoute2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1c5d40c22134ab0a26046b38169beac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRoute2(ptr: Pointer?): WithDefault = IMapRoute2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRoute2 {
      val address = segment.toRawLongValue()
      return makeIMapRoute2(Pointer(address))
    }

    public override fun toNative(obj: IMapRoute2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1501242344_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRoute2): Array<IMapRoute2?> = (elements as
        Array<IMapRoute2?>).castToImpl<IMapRoute2,IMapRoute2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRoute2?> = arrayOfNulls<IMapRoute2_Impl>(size)
        as Array<IMapRoute2?>
  }
}
