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

@ABIMarker(ICompositionProjectedShadowCasterCollection.ABI::class)
@Signature("{b120bfdc-533c-57a9-ae16-d43ba52472c4}")
@Guid("b120bfdc533c57a9ae16d43ba52472c4")
@WinRTInterface("b120bfdc533c57a9ae16d43ba52472c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionProjectedShadowCasterCollection.ByReference::class)
public interface ICompositionProjectedShadowCasterCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun InsertAbove(newCaster: CompositionProjectedShadowCaster?,
      reference: CompositionProjectedShadowCaster?): Unit

  @InterfaceMethod(2)
  public fun InsertAtBottom(newCaster: CompositionProjectedShadowCaster?): Unit

  @InterfaceMethod(3)
  public fun InsertAtTop(newCaster: CompositionProjectedShadowCaster?): Unit

  @InterfaceMethod(4)
  public fun InsertBelow(newCaster: CompositionProjectedShadowCaster?,
      reference: CompositionProjectedShadowCaster?): Unit

  @InterfaceMethod(5)
  public fun Remove(caster: CompositionProjectedShadowCaster?): Unit

  @InterfaceMethod(6)
  public fun RemoveAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionProjectedShadowCasterCollection> {
    public override fun getValue() =
        ABI.makeICompositionProjectedShadowCasterCollection(pointer.getPointer(0))

    public fun setValue(value: ICompositionProjectedShadowCasterCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionProjectedShadowCasterCollection {
    public val __1872167279_Ptr: Pointer?

    public val _1872167279_VtblPtr: Pointer?
      get() = __1872167279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun InsertAbove(newCaster: CompositionProjectedShadowCaster?,
        reference: CompositionProjectedShadowCaster?): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, marshalToNative(newCaster),
          marshalToNative(reference),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InsertAtBottom(newCaster: CompositionProjectedShadowCaster?): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, marshalToNative(newCaster),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InsertAtTop(newCaster: CompositionProjectedShadowCaster?): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, marshalToNative(newCaster),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun InsertBelow(newCaster: CompositionProjectedShadowCaster?,
        reference: CompositionProjectedShadowCaster?): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, marshalToNative(newCaster),
          marshalToNative(reference),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Remove(caster: CompositionProjectedShadowCaster?): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, marshalToNative(caster),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RemoveAll(): Unit {
      val fnPtr = _1872167279_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1872167279_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionProjectedShadowCasterCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1872167279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionProjectedShadowCasterCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b120bfdc533c57a9ae16d43ba52472c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionProjectedShadowCasterCollection(ptr: Pointer?): WithDefault =
        ICompositionProjectedShadowCasterCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionProjectedShadowCasterCollection {
      val address = segment.toRawLongValue()
      return makeICompositionProjectedShadowCasterCollection(Pointer(address))
    }

    public override fun toNative(obj: ICompositionProjectedShadowCasterCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1872167279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionProjectedShadowCasterCollection):
        Array<ICompositionProjectedShadowCasterCollection?> = (elements as
        Array<ICompositionProjectedShadowCasterCollection?>).castToImpl<ICompositionProjectedShadowCasterCollection,ICompositionProjectedShadowCasterCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionProjectedShadowCasterCollection?> =
        arrayOfNulls<ICompositionProjectedShadowCasterCollection_Impl>(size) as
        Array<ICompositionProjectedShadowCasterCollection?>
  }
}
