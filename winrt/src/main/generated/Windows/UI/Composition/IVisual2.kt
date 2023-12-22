package Windows.UI.Composition

import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IVisual2.ABI::class)
@Signature("{3052b611-56c3-4c3e-8bf3-f6e1ad473f06}")
@Guid("3052b61156c34c3e8bf3f6e1ad473f06")
@WinRTInterface("3052b61156c34c3e8bf3f6e1ad473f06")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisual2.ByReference::class)
public interface IVisual2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ParentForTransform(): Visual?

  @InterfaceMethod(1)
  public fun put_ParentForTransform(value: Visual?): Unit

  @InterfaceMethod(2)
  public fun get_RelativeOffsetAdjustment(): Vector3?

  @InterfaceMethod(3)
  public fun put_RelativeOffsetAdjustment(value: Vector3?): Unit

  @InterfaceMethod(4)
  public fun get_RelativeSizeAdjustment(): Vector2?

  @InterfaceMethod(5)
  public fun put_RelativeSizeAdjustment(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisual2> {
    public override fun getValue() = ABI.makeIVisual2(pointer.getPointer(0))

    public fun setValue(value: IVisual2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisual2 {
    public val __1503992196_Ptr: Pointer?

    public val _1503992196_VtblPtr: Pointer?
      get() = __1503992196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ParentForTransform(): Visual? {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ParentForTransform(value: Visual?): Unit {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RelativeOffsetAdjustment(): Vector3? {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RelativeOffsetAdjustment(value: Vector3?): Unit {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RelativeSizeAdjustment(): Vector2? {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RelativeSizeAdjustment(value: Vector2?): Unit {
      val fnPtr = _1503992196_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1503992196_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisual2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503992196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisual2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3052b61156c34c3e8bf3f6e1ad473f06")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisual2(ptr: Pointer?): WithDefault = IVisual2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisual2 {
      val address = segment.toRawLongValue()
      return makeIVisual2(Pointer(address))
    }

    public override fun toNative(obj: IVisual2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503992196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisual2): Array<IVisual2?> = (elements as
        Array<IVisual2?>).castToImpl<IVisual2,IVisual2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisual2?> = arrayOfNulls<IVisual2_Impl>(size) as
        Array<IVisual2?>
  }
}
