package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapElement2.ABI::class)
@Signature("{6619f261-fba6-4964-a7ff-f1af63ab9cb0}")
@Guid("6619f261fba64964a7fff1af63ab9cb0")
@WinRTInterface("6619f261fba64964a7fff1af63ab9cb0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElement2.ByReference::class)
public interface IMapElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapTabIndex(): Int

  @InterfaceMethod(1)
  public fun put_MapTabIndex(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapElement2> {
    public override fun getValue() = ABI.makeIMapElement2(pointer.getPointer(0))

    public fun setValue(value: IMapElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElement2 {
    public val __1968925631_Ptr: Pointer?

    public val _1968925631_VtblPtr: Pointer?
      get() = __1968925631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapTabIndex(): Int {
      val fnPtr = _1968925631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1968925631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MapTabIndex(value: Int): Unit {
      val fnPtr = _1968925631_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968925631_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1968925631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6619f261fba64964a7fff1af63ab9cb0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElement2(ptr: Pointer?): WithDefault = IMapElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElement2 {
      val address = segment.toRawLongValue()
      return makeIMapElement2(Pointer(address))
    }

    public override fun toNative(obj: IMapElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1968925631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElement2): Array<IMapElement2?> = (elements as
        Array<IMapElement2?>).castToImpl<IMapElement2,IMapElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElement2?> =
        arrayOfNulls<IMapElement2_Impl>(size) as Array<IMapElement2?>
  }
}
