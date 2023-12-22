package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeViewItem2.ABI::class)
@Signature("{b1b70143-3f5b-54f4-8bd7-41dc15cf45a9}")
@Guid("b1b701433f5b54f48bd741dc15cf45a9")
@WinRTInterface("b1b701433f5b54f48bd741dc15cf45a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItem2.ByReference::class)
public interface ITreeViewItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasUnrealizedChildren(): Boolean

  @InterfaceMethod(1)
  public fun put_HasUnrealizedChildren(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(3)
  public fun put_ItemsSource(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeViewItem2>
      {
    public override fun getValue() = ABI.makeITreeViewItem2(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItem2 {
    public val __438142837_Ptr: Pointer?

    public val _438142837_VtblPtr: Pointer?
      get() = __438142837_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasUnrealizedChildren(): Boolean {
      val fnPtr = _438142837_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__438142837_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_HasUnrealizedChildren(value: Boolean): Unit {
      val fnPtr = _438142837_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438142837_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _438142837_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__438142837_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _438142837_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438142837_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITreeViewItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438142837_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1b701433f5b54f48bd741dc15cf45a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItem2(ptr: Pointer?): WithDefault = ITreeViewItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItem2 {
      val address = segment.toRawLongValue()
      return makeITreeViewItem2(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438142837_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItem2): Array<ITreeViewItem2?> = (elements as
        Array<ITreeViewItem2?>).castToImpl<ITreeViewItem2,ITreeViewItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItem2?> =
        arrayOfNulls<ITreeViewItem2_Impl>(size) as Array<ITreeViewItem2?>
  }
}
