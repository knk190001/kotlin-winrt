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

@ABIMarker(ITransformGroup.ABI::class)
@Signature("{63418ccc-8d2d-4737-b951-2afce1ddc4c4}")
@Guid("63418ccc8d2d4737b9512afce1ddc4c4")
@WinRTInterface("63418ccc8d2d4737b9512afce1ddc4c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformGroup.ByReference::class)
public interface ITransformGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): TransformCollection?

  @InterfaceMethod(1)
  public fun put_Children(value: TransformCollection?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): Matrix?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformGroup> {
    public override fun getValue() = ABI.makeITransformGroup(pointer.getPointer(0))

    public fun setValue(value: ITransformGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformGroup {
    public val __339359889_Ptr: Pointer?

    public val _339359889_VtblPtr: Pointer?
      get() = __339359889_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): TransformCollection? {
      val fnPtr = _339359889_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransformCollection>()
      val hr = fn.invokeHR(arrayOf(__339359889_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransformCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Children(value: TransformCollection?): Unit {
      val fnPtr = _339359889_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__339359889_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): Matrix? {
      val fnPtr = _339359889_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix>()
      val hr = fn.invokeHR(arrayOf(__339359889_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix>(result.getValue())
      return resultValue
    }
  }

  public class ITransformGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __339359889_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63418ccc8d2d4737b9512afce1ddc4c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformGroup(ptr: Pointer?): WithDefault = ITransformGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformGroup {
      val address = segment.toRawLongValue()
      return makeITransformGroup(Pointer(address))
    }

    public override fun toNative(obj: ITransformGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__339359889_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformGroup): Array<ITransformGroup?> = (elements as
        Array<ITransformGroup?>).castToImpl<ITransformGroup,ITransformGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformGroup?> =
        arrayOfNulls<ITransformGroup_Impl>(size) as Array<ITransformGroup?>
  }
}
