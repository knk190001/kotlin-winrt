package Windows.UI.Composition.Interactions

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTrackerValuesChangedArgs.ABI::class)
@Signature("{cf1578ef-d3df-4501-b9e6-f02fb22f73d0}")
@Guid("cf1578efd3df4501b9e6f02fb22f73d0")
@WinRTInterface("cf1578efd3df4501b9e6f02fb22f73d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerValuesChangedArgs.ByReference::class)
public interface IInteractionTrackerValuesChangedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun get_RequestId(): Int

  @InterfaceMethod(2)
  public fun get_Scale(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerValuesChangedArgs> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerValuesChangedArgs(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerValuesChangedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerValuesChangedArgs {
    public val __1980066892_Ptr: Pointer?

    public val _1980066892_VtblPtr: Pointer?
      get() = __1980066892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1980066892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1980066892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestId(): Int {
      val fnPtr = _1980066892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1980066892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Scale(): Float {
      val fnPtr = _1980066892_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1980066892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerValuesChangedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980066892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerValuesChangedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf1578efd3df4501b9e6f02fb22f73d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerValuesChangedArgs(ptr: Pointer?): WithDefault =
        IInteractionTrackerValuesChangedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerValuesChangedArgs {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerValuesChangedArgs(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerValuesChangedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980066892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerValuesChangedArgs):
        Array<IInteractionTrackerValuesChangedArgs?> = (elements as
        Array<IInteractionTrackerValuesChangedArgs?>).castToImpl<IInteractionTrackerValuesChangedArgs,IInteractionTrackerValuesChangedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerValuesChangedArgs?> =
        arrayOfNulls<IInteractionTrackerValuesChangedArgs_Impl>(size) as
        Array<IInteractionTrackerValuesChangedArgs?>
  }
}
