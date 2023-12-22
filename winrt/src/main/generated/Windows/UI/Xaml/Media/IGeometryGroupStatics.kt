package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IGeometryGroupStatics.ABI::class)
@Signature("{56c955f4-8496-4bb6-abf0-617b1fe78b45}")
@Guid("56c955f484964bb6abf0617b1fe78b45")
@WinRTInterface("56c955f484964bb6abf0617b1fe78b45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeometryGroupStatics.ByReference::class)
public interface IGeometryGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRuleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ChildrenProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeometryGroupStatics> {
    public override fun getValue() = ABI.makeIGeometryGroupStatics(pointer.getPointer(0))

    public fun setValue(value: IGeometryGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeometryGroupStatics {
    public val __1717346772_Ptr: Pointer?

    public val _1717346772_VtblPtr: Pointer?
      get() = __1717346772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRuleProperty(): DependencyProperty? {
      val fnPtr = _1717346772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1717346772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChildrenProperty(): DependencyProperty? {
      val fnPtr = _1717346772_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1717346772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGeometryGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1717346772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeometryGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56c955f484964bb6abf0617b1fe78b45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeometryGroupStatics(ptr: Pointer?): WithDefault =
        IGeometryGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeometryGroupStatics {
      val address = segment.toRawLongValue()
      return makeIGeometryGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeometryGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1717346772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeometryGroupStatics): Array<IGeometryGroupStatics?> =
        (elements as
        Array<IGeometryGroupStatics?>).castToImpl<IGeometryGroupStatics,IGeometryGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeometryGroupStatics?> =
        arrayOfNulls<IGeometryGroupStatics_Impl>(size) as Array<IGeometryGroupStatics?>
  }
}
