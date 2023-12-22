package Windows.UI.Xaml.Interop

import Windows.UI.Xaml.Interop.IBindableIterable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindableVector.ABI::class)
@Signature("{393de7de-6fd0-4c0d-bb71-47244a113e93}")
@Guid("393de7de6fd04c0dbb7147244a113e93")
@WinRTInterface("393de7de6fd04c0dbb7147244a113e93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindableVector.ByReference::class)
public interface IBindableVector : NativeMapped, IWinRTInterface, IBindableIterable {
  @InterfaceMethod(0)
  public fun GetAt(index: WinDef.UINT): IUnknown?

  @InterfaceMethod(1)
  public fun get_Size(): WinDef.UINT

  @InterfaceMethod(2)
  public fun GetView(): IBindableVectorView?

  @InterfaceMethod(3)
  public fun IndexOf(value: IUnknown?, index: WinDef.UINT): Boolean

  @InterfaceMethod(4)
  public fun SetAt(index: WinDef.UINT, value: IUnknown?): Unit

  @InterfaceMethod(5)
  public fun InsertAt(index: WinDef.UINT, value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun RemoveAt(index: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun Append(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun RemoveAtEnd(): Unit

  @InterfaceMethod(9)
  public fun Clear(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindableVector> {
    public override fun getValue() = ABI.makeIBindableVector(pointer.getPointer(0))

    public fun setValue(value: IBindableVector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindableVector, IBindableIterable.WithDefault {
    public val __1565769347_Ptr: Pointer?

    public val _1565769347_VtblPtr: Pointer?
      get() = __1565769347_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAt(index: WinDef.UINT): IUnknown? {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): WinDef.UINT {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetView(): IBindableVectorView? {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBindableVectorView>()
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBindableVectorView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun IndexOf(value: IUnknown?, index: WinDef.UINT): Boolean {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, marshalToNative(value), index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun SetAt(index: WinDef.UINT, value: IUnknown?): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, index, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun InsertAt(index: WinDef.UINT, value: IUnknown?): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, index, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RemoveAt(index: WinDef.UINT): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, index,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Append(value: IUnknown?): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun RemoveAtEnd(): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Clear(): Unit {
      val fnPtr = _1565769347_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1565769347_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBindableVector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBindableIterable {
    public override val __2130116140_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1565769347_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1565769347_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindableVector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("393de7de6fd04c0dbb7147244a113e93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindableVector(ptr: Pointer?): WithDefault = IBindableVector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindableVector {
      val address = segment.toRawLongValue()
      return makeIBindableVector(Pointer(address))
    }

    public override fun toNative(obj: IBindableVector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1565769347_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindableVector): Array<IBindableVector?> = (elements as
        Array<IBindableVector?>).castToImpl<IBindableVector,IBindableVector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindableVector?> =
        arrayOfNulls<IBindableVector_Impl>(size) as Array<IBindableVector?>
  }
}
