package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapPropertiesView.ABI::class)
@Signature("{7e0fe87a-3a70-48f8-9c55-196cf5a545f5}")
@Guid("7e0fe87a3a7048f89c55196cf5a545f5")
@WinRTInterface("7e0fe87a3a7048f89c55196cf5a545f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapPropertiesView.ByReference::class)
public interface IBitmapPropertiesView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPropertiesAsync(propertiesToRetrieve: IIterable<String?>?):
      IAsyncOperation<BitmapPropertySet?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapPropertiesView> {
    public override fun getValue() = ABI.makeIBitmapPropertiesView(pointer.getPointer(0))

    public fun setValue(value: IBitmapPropertiesView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapPropertiesView {
    public val __873349200_Ptr: Pointer?

    public val _873349200_VtblPtr: Pointer?
      get() = __873349200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPropertiesAsync(propertiesToRetrieve: IIterable<String?>?):
        IAsyncOperation<BitmapPropertySet?>? {
      val fnPtr = _873349200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapPropertySet?>>()
      val hr = fn.invokeHR(arrayOf(__873349200_Ptr, marshalToNative(propertiesToRetrieve), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapPropertySet?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapPropertiesView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __873349200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapPropertiesView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e0fe87a3a7048f89c55196cf5a545f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapPropertiesView(ptr: Pointer?): WithDefault =
        IBitmapPropertiesView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapPropertiesView {
      val address = segment.toRawLongValue()
      return makeIBitmapPropertiesView(Pointer(address))
    }

    public override fun toNative(obj: IBitmapPropertiesView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__873349200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapPropertiesView): Array<IBitmapPropertiesView?> =
        (elements as
        Array<IBitmapPropertiesView?>).castToImpl<IBitmapPropertiesView,IBitmapPropertiesView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapPropertiesView?> =
        arrayOfNulls<IBitmapPropertiesView_Impl>(size) as Array<IBitmapPropertiesView?>
  }
}
