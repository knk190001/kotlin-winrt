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

@ABIMarker(IVisualCollection.ABI::class)
@Signature("{8b745505-fd3e-4a98-84a8-e949468c6bcb}")
@Guid("8b745505fd3e4a9884a8e949468c6bcb")
@WinRTInterface("8b745505fd3e4a9884a8e949468c6bcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualCollection.ByReference::class)
public interface IVisualCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun InsertAbove(newChild: Visual?, sibling: Visual?): Unit

  @InterfaceMethod(2)
  public fun InsertAtBottom(newChild: Visual?): Unit

  @InterfaceMethod(3)
  public fun InsertAtTop(newChild: Visual?): Unit

  @InterfaceMethod(4)
  public fun InsertBelow(newChild: Visual?, sibling: Visual?): Unit

  @InterfaceMethod(5)
  public fun Remove(child: Visual?): Unit

  @InterfaceMethod(6)
  public fun RemoveAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualCollection> {
    public override fun getValue() = ABI.makeIVisualCollection(pointer.getPointer(0))

    public fun setValue(value: IVisualCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualCollection {
    public val __714395052_Ptr: Pointer?

    public val _714395052_VtblPtr: Pointer?
      get() = __714395052_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _714395052_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun InsertAbove(newChild: Visual?, sibling: Visual?): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, marshalToNative(newChild),
          marshalToNative(sibling),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InsertAtBottom(newChild: Visual?): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, marshalToNative(newChild),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InsertAtTop(newChild: Visual?): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, marshalToNative(newChild),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun InsertBelow(newChild: Visual?, sibling: Visual?): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, marshalToNative(newChild),
          marshalToNative(sibling),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Remove(child: Visual?): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, marshalToNative(child),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RemoveAll(): Unit {
      val fnPtr = _714395052_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714395052_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __714395052_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b745505fd3e4a9884a8e949468c6bcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualCollection(ptr: Pointer?): WithDefault = IVisualCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualCollection {
      val address = segment.toRawLongValue()
      return makeIVisualCollection(Pointer(address))
    }

    public override fun toNative(obj: IVisualCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714395052_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualCollection): Array<IVisualCollection?> = (elements
        as Array<IVisualCollection?>).castToImpl<IVisualCollection,IVisualCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualCollection?> =
        arrayOfNulls<IVisualCollection_Impl>(size) as Array<IVisualCollection?>
  }
}
