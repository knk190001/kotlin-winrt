package Microsoft.UI.Xaml

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

@ABIMarker(ISetterBase.ABI::class)
@Signature("{5a7c1347-cda3-55be-bfef-5c7582213980}")
@Guid("5a7c1347cda355bebfef5c7582213980")
@WinRTInterface("5a7c1347cda355bebfef5c7582213980")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetterBase.ByReference::class)
public interface ISetterBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSealed(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISetterBase> {
    public override fun getValue() = ABI.makeISetterBase(pointer.getPointer(0))

    public fun setValue(value: ISetterBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetterBase {
    public val __1491763063_Ptr: Pointer?

    public val _1491763063_VtblPtr: Pointer?
      get() = __1491763063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSealed(): Boolean {
      val fnPtr = _1491763063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1491763063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISetterBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491763063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetterBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a7c1347cda355bebfef5c7582213980")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetterBase(ptr: Pointer?): WithDefault = ISetterBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetterBase {
      val address = segment.toRawLongValue()
      return makeISetterBase(Pointer(address))
    }

    public override fun toNative(obj: ISetterBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491763063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetterBase): Array<ISetterBase?> = (elements as
        Array<ISetterBase?>).castToImpl<ISetterBase,ISetterBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetterBase?> =
        arrayOfNulls<ISetterBase_Impl>(size) as Array<ISetterBase?>
  }
}
