package Microsoft.UI.Composition.Interactions

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

@ABIMarker(ICompositionInteractionSourceCollection.ABI::class)
@Signature("{9aa1b86b-b002-5e2e-bb2b-0e2c547445e1}")
@Guid("9aa1b86bb0025e2ebb2b0e2c547445e1")
@WinRTInterface("9aa1b86bb0025e2ebb2b0e2c547445e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionInteractionSourceCollection.ByReference::class)
public interface ICompositionInteractionSourceCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun Add(value: ICompositionInteractionSource?): Unit

  @InterfaceMethod(2)
  public fun Remove(value: ICompositionInteractionSource?): Unit

  @InterfaceMethod(3)
  public fun RemoveAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionInteractionSourceCollection> {
    public override fun getValue() =
        ABI.makeICompositionInteractionSourceCollection(pointer.getPointer(0))

    public fun setValue(value: ICompositionInteractionSourceCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionInteractionSourceCollection {
    public val __1917098091_Ptr: Pointer?

    public val _1917098091_VtblPtr: Pointer?
      get() = __1917098091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _1917098091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1917098091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Add(value: ICompositionInteractionSource?): Unit {
      val fnPtr = _1917098091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917098091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Remove(value: ICompositionInteractionSource?): Unit {
      val fnPtr = _1917098091_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917098091_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveAll(): Unit {
      val fnPtr = _1917098091_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917098091_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionInteractionSourceCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1917098091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionInteractionSourceCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9aa1b86bb0025e2ebb2b0e2c547445e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionInteractionSourceCollection(ptr: Pointer?): WithDefault =
        ICompositionInteractionSourceCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionInteractionSourceCollection {
      val address = segment.toRawLongValue()
      return makeICompositionInteractionSourceCollection(Pointer(address))
    }

    public override fun toNative(obj: ICompositionInteractionSourceCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1917098091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionInteractionSourceCollection):
        Array<ICompositionInteractionSourceCollection?> = (elements as
        Array<ICompositionInteractionSourceCollection?>).castToImpl<ICompositionInteractionSourceCollection,ICompositionInteractionSourceCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionInteractionSourceCollection?> =
        arrayOfNulls<ICompositionInteractionSourceCollection_Impl>(size) as
        Array<ICompositionInteractionSourceCollection?>
  }
}
