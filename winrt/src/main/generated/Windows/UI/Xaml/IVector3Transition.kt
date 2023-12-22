package Windows.UI.Xaml

import Windows.Foundation.TimeSpan
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

@ABIMarker(IVector3Transition.ABI::class)
@Signature("{d2e209dc-c4a2-5101-9a68-fa0150505589}")
@Guid("d2e209dcc4a251019a68fa0150505589")
@WinRTInterface("d2e209dcc4a251019a68fa0150505589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector3Transition.ByReference::class)
public interface IVector3Transition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_Components(): Vector3TransitionComponents?

  @InterfaceMethod(3)
  public fun put_Components(value: Vector3TransitionComponents?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector3Transition> {
    public override fun getValue() = ABI.makeIVector3Transition(pointer.getPointer(0))

    public fun setValue(value: IVector3Transition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector3Transition {
    public val __453907635_Ptr: Pointer?

    public val _453907635_VtblPtr: Pointer?
      get() = __453907635_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _453907635_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__453907635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _453907635_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453907635_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Components(): Vector3TransitionComponents? {
      val fnPtr = _453907635_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3TransitionComponents>()
      val hr = fn.invokeHR(arrayOf(__453907635_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3TransitionComponents>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Components(value: Vector3TransitionComponents?): Unit {
      val fnPtr = _453907635_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453907635_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector3Transition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __453907635_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector3Transition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2e209dcc4a251019a68fa0150505589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector3Transition(ptr: Pointer?): WithDefault = IVector3Transition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector3Transition {
      val address = segment.toRawLongValue()
      return makeIVector3Transition(Pointer(address))
    }

    public override fun toNative(obj: IVector3Transition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__453907635_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector3Transition): Array<IVector3Transition?> =
        (elements as
        Array<IVector3Transition?>).castToImpl<IVector3Transition,IVector3Transition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector3Transition?> =
        arrayOfNulls<IVector3Transition_Impl>(size) as Array<IVector3Transition?>
  }
}
