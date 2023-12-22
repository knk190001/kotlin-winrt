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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsSourceView.ABI::class)
@Signature("{f7f802de-e79c-5c5f-abf8-ccbd486b89d6}")
@Guid("f7f802dee79c5c5fabf8ccbd486b89d6")
@WinRTInterface("f7f802dee79c5c5fabf8ccbd486b89d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsSourceView.ByReference::class)
public interface IItemsSourceView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Count(): Int

  @InterfaceMethod(1)
  public fun GetAt(index: Int): IUnknown?

  @InterfaceMethod(2)
  public fun get_HasKeyIndexMapping(): Boolean

  @InterfaceMethod(3)
  public fun KeyFromIndex(index: Int): String?

  @InterfaceMethod(4)
  public fun IndexFromKey(key: String?): Int

  @InterfaceMethod(5)
  public fun IndexOf(item: IUnknown?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsSourceView> {
    public override fun getValue() = ABI.makeIItemsSourceView(pointer.getPointer(0))

    public fun setValue(value: IItemsSourceView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsSourceView {
    public val __1678422169_Ptr: Pointer?

    public val _1678422169_VtblPtr: Pointer?
      get() = __1678422169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Count(): Int {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetAt(index: Int): IUnknown? {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasKeyIndexMapping(): Boolean {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun KeyFromIndex(index: Int): String? {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun IndexFromKey(key: String?): Int {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IndexOf(item: IUnknown?): Int {
      val fnPtr = _1678422169_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1678422169_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IItemsSourceView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1678422169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsSourceView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7f802dee79c5c5fabf8ccbd486b89d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsSourceView(ptr: Pointer?): WithDefault = IItemsSourceView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsSourceView {
      val address = segment.toRawLongValue()
      return makeIItemsSourceView(Pointer(address))
    }

    public override fun toNative(obj: IItemsSourceView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1678422169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsSourceView): Array<IItemsSourceView?> = (elements as
        Array<IItemsSourceView?>).castToImpl<IItemsSourceView,IItemsSourceView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsSourceView?> =
        arrayOfNulls<IItemsSourceView_Impl>(size) as Array<IItemsSourceView?>
  }
}
