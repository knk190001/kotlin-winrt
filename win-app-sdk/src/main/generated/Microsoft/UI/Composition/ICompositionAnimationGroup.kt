package Microsoft.UI.Composition

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

@ABIMarker(ICompositionAnimationGroup.ABI::class)
@Signature("{a51cdcac-b972-5ae7-81d0-9d91c71ecb7a}")
@Guid("a51cdcacb9725ae781d09d91c71ecb7a")
@WinRTInterface("a51cdcacb9725ae781d09d91c71ecb7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimationGroup.ByReference::class)
public interface ICompositionAnimationGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun Add(value: CompositionAnimation?): Unit

  @InterfaceMethod(2)
  public fun Remove(value: CompositionAnimation?): Unit

  @InterfaceMethod(3)
  public fun RemoveAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimationGroup> {
    public override fun getValue() = ABI.makeICompositionAnimationGroup(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimationGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimationGroup {
    public val __1508935764_Ptr: Pointer?

    public val _1508935764_VtblPtr: Pointer?
      get() = __1508935764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _1508935764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1508935764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Add(value: CompositionAnimation?): Unit {
      val fnPtr = _1508935764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508935764_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Remove(value: CompositionAnimation?): Unit {
      val fnPtr = _1508935764_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508935764_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveAll(): Unit {
      val fnPtr = _1508935764_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508935764_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionAnimationGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1508935764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimationGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a51cdcacb9725ae781d09d91c71ecb7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimationGroup(ptr: Pointer?): WithDefault =
        ICompositionAnimationGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimationGroup {
      val address = segment.toRawLongValue()
      return makeICompositionAnimationGroup(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1508935764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimationGroup):
        Array<ICompositionAnimationGroup?> = (elements as
        Array<ICompositionAnimationGroup?>).castToImpl<ICompositionAnimationGroup,ICompositionAnimationGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimationGroup?> =
        arrayOfNulls<ICompositionAnimationGroup_Impl>(size) as Array<ICompositionAnimationGroup?>
  }
}
