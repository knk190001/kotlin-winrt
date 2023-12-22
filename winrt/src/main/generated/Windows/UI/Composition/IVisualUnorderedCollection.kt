package Windows.UI.Composition

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

@ABIMarker(IVisualUnorderedCollection.ABI::class)
@Signature("{338faa70-54c8-40a7-8029-c9ceeb0aa250}")
@Guid("338faa7054c840a78029c9ceeb0aa250")
@WinRTInterface("338faa7054c840a78029c9ceeb0aa250")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualUnorderedCollection.ByReference::class)
public interface IVisualUnorderedCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun Add(newVisual: Visual?): Unit

  @InterfaceMethod(2)
  public fun Remove(visual: Visual?): Unit

  @InterfaceMethod(3)
  public fun RemoveAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualUnorderedCollection> {
    public override fun getValue() = ABI.makeIVisualUnorderedCollection(pointer.getPointer(0))

    public fun setValue(value: IVisualUnorderedCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualUnorderedCollection {
    public val __2036622884_Ptr: Pointer?

    public val _2036622884_VtblPtr: Pointer?
      get() = __2036622884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _2036622884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2036622884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Add(newVisual: Visual?): Unit {
      val fnPtr = _2036622884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036622884_Ptr, marshalToNative(newVisual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Remove(visual: Visual?): Unit {
      val fnPtr = _2036622884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036622884_Ptr, marshalToNative(visual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveAll(): Unit {
      val fnPtr = _2036622884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036622884_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualUnorderedCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2036622884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualUnorderedCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("338faa7054c840a78029c9ceeb0aa250")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualUnorderedCollection(ptr: Pointer?): WithDefault =
        IVisualUnorderedCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualUnorderedCollection {
      val address = segment.toRawLongValue()
      return makeIVisualUnorderedCollection(Pointer(address))
    }

    public override fun toNative(obj: IVisualUnorderedCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2036622884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualUnorderedCollection):
        Array<IVisualUnorderedCollection?> = (elements as
        Array<IVisualUnorderedCollection?>).castToImpl<IVisualUnorderedCollection,IVisualUnorderedCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualUnorderedCollection?> =
        arrayOfNulls<IVisualUnorderedCollection_Impl>(size) as Array<IVisualUnorderedCollection?>
  }
}
