package Windows.UI.Xaml.Media

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

@ABIMarker(IGeometryGroup.ABI::class)
@Signature("{55225a61-8677-4c8c-8e46-ee3dc355114b}")
@Guid("55225a6186774c8c8e46ee3dc355114b")
@WinRTInterface("55225a6186774c8c8e46ee3dc355114b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeometryGroup.ByReference::class)
public interface IGeometryGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillRule(): FillRule?

  @InterfaceMethod(1)
  public fun put_FillRule(value: FillRule?): Unit

  @InterfaceMethod(2)
  public fun get_Children(): GeometryCollection?

  @InterfaceMethod(3)
  public fun put_Children(value: GeometryCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeometryGroup>
      {
    public override fun getValue() = ABI.makeIGeometryGroup(pointer.getPointer(0))

    public fun setValue(value: IGeometryGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeometryGroup {
    public val __1572109489_Ptr: Pointer?

    public val _1572109489_VtblPtr: Pointer?
      get() = __1572109489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillRule(): FillRule? {
      val fnPtr = _1572109489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FillRule>()
      val hr = fn.invokeHR(arrayOf(__1572109489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FillRule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FillRule(value: FillRule?): Unit {
      val fnPtr = _1572109489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572109489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Children(): GeometryCollection? {
      val fnPtr = _1572109489_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeometryCollection>()
      val hr = fn.invokeHR(arrayOf(__1572109489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeometryCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Children(value: GeometryCollection?): Unit {
      val fnPtr = _1572109489_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572109489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeometryGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572109489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeometryGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55225a6186774c8c8e46ee3dc355114b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeometryGroup(ptr: Pointer?): WithDefault = IGeometryGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeometryGroup {
      val address = segment.toRawLongValue()
      return makeIGeometryGroup(Pointer(address))
    }

    public override fun toNative(obj: IGeometryGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572109489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeometryGroup): Array<IGeometryGroup?> = (elements as
        Array<IGeometryGroup?>).castToImpl<IGeometryGroup,IGeometryGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeometryGroup?> =
        arrayOfNulls<IGeometryGroup_Impl>(size) as Array<IGeometryGroup?>
  }
}
