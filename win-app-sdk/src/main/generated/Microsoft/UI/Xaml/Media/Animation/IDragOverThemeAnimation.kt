package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Controls.Primitives.AnimationDirection
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragOverThemeAnimation.ABI::class)
@Signature("{633cd3c0-71af-52fd-993e-504e3e6f56d4}")
@Guid("633cd3c071af52fd993e504e3e6f56d4")
@WinRTInterface("633cd3c071af52fd993e504e3e6f56d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragOverThemeAnimation.ByReference::class)
public interface IDragOverThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ToOffset(): Double

  @InterfaceMethod(3)
  public fun put_ToOffset(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Direction(): AnimationDirection?

  @InterfaceMethod(5)
  public fun put_Direction(value: AnimationDirection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragOverThemeAnimation> {
    public override fun getValue() = ABI.makeIDragOverThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IDragOverThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragOverThemeAnimation {
    public val __1210610110_Ptr: Pointer?

    public val _1210610110_VtblPtr: Pointer?
      get() = __1210610110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ToOffset(): Double {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ToOffset(value: Double): Unit {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Direction(): AnimationDirection? {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDirection>()
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Direction(value: AnimationDirection?): Unit {
      val fnPtr = _1210610110_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1210610110_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragOverThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1210610110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragOverThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("633cd3c071af52fd993e504e3e6f56d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragOverThemeAnimation(ptr: Pointer?): WithDefault =
        IDragOverThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragOverThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIDragOverThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IDragOverThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1210610110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragOverThemeAnimation): Array<IDragOverThemeAnimation?>
        = (elements as
        Array<IDragOverThemeAnimation?>).castToImpl<IDragOverThemeAnimation,IDragOverThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragOverThemeAnimation?> =
        arrayOfNulls<IDragOverThemeAnimation_Impl>(size) as Array<IDragOverThemeAnimation?>
  }
}
