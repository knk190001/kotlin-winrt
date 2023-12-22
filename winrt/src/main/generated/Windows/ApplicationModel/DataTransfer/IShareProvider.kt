package Windows.ApplicationModel.DataTransfer

import Windows.Storage.Streams.RandomAccessStreamReference
import Windows.UI.Color
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShareProvider.ABI::class)
@Signature("{2fabe026-443e-4cda-af25-8d81070efd80}")
@Guid("2fabe026443e4cdaaf258d81070efd80")
@WinRTInterface("2fabe026443e4cdaaf258d81070efd80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareProvider.ByReference::class)
public interface IShareProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun get_DisplayIcon(): RandomAccessStreamReference?

  @InterfaceMethod(2)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(3)
  public fun get_Tag(): IUnknown?

  @InterfaceMethod(4)
  public fun put_Tag(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShareProvider>
      {
    public override fun getValue() = ABI.makeIShareProvider(pointer.getPointer(0))

    public fun setValue(value: IShareProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareProvider {
    public val __774078874_Ptr: Pointer?

    public val _774078874_VtblPtr: Pointer?
      get() = __774078874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _774078874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__774078874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayIcon(): RandomAccessStreamReference? {
      val fnPtr = _774078874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__774078874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _774078874_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__774078874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Tag(): IUnknown? {
      val fnPtr = _774078874_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__774078874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Tag(value: IUnknown?): Unit {
      val fnPtr = _774078874_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__774078874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __774078874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2fabe026443e4cdaaf258d81070efd80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareProvider(ptr: Pointer?): WithDefault = IShareProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareProvider {
      val address = segment.toRawLongValue()
      return makeIShareProvider(Pointer(address))
    }

    public override fun toNative(obj: IShareProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__774078874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareProvider): Array<IShareProvider?> = (elements as
        Array<IShareProvider?>).castToImpl<IShareProvider,IShareProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareProvider?> =
        arrayOfNulls<IShareProvider_Impl>(size) as Array<IShareProvider?>
  }
}
