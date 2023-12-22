package Windows.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
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

@ABIMarker(IDragEventArgs3.ABI::class)
@Signature("{d04fc3c6-8119-427a-8152-5f9550cc0416}")
@Guid("d04fc3c68119427a81525f9550cc0416")
@WinRTInterface("d04fc3c68119427a81525f9550cc0416")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragEventArgs3.ByReference::class)
public interface IDragEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowedOperations(): DataPackageOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragEventArgs3> {
    public override fun getValue() = ABI.makeIDragEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IDragEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragEventArgs3 {
    public val __1157177438_Ptr: Pointer?

    public val _1157177438_VtblPtr: Pointer?
      get() = __1157177438_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _1157177438_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1157177438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }
  }

  public class IDragEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157177438_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d04fc3c68119427a81525f9550cc0416")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragEventArgs3(ptr: Pointer?): WithDefault = IDragEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIDragEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IDragEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157177438_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragEventArgs3): Array<IDragEventArgs3?> = (elements as
        Array<IDragEventArgs3?>).castToImpl<IDragEventArgs3,IDragEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragEventArgs3?> =
        arrayOfNulls<IDragEventArgs3_Impl>(size) as Array<IDragEventArgs3?>
  }
}
