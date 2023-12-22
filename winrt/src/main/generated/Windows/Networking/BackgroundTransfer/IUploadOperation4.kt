package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IUploadOperation4.ABI::class)
@Signature("{50edef31-fac5-41ee-b030-dc77caee9faa}")
@Guid("50edef31fac541eeb030dc77caee9faa")
@WinRTInterface("50edef31fac541eeb030dc77caee9faa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUploadOperation4.ByReference::class)
public interface IUploadOperation4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetRequestHeader(headerName: String?, headerValue: String?): Unit

  @InterfaceMethod(1)
  public fun RemoveRequestHeader(headerName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUploadOperation4> {
    public override fun getValue() = ABI.makeIUploadOperation4(pointer.getPointer(0))

    public fun setValue(value: IUploadOperation4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUploadOperation4 {
    public val __525389263_Ptr: Pointer?

    public val _525389263_VtblPtr: Pointer?
      get() = __525389263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetRequestHeader(headerName: String?, headerValue: String?): Unit {
      val fnPtr = _525389263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__525389263_Ptr, marshalToNative(headerName),
          marshalToNative(headerValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RemoveRequestHeader(headerName: String?): Unit {
      val fnPtr = _525389263_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__525389263_Ptr, marshalToNative(headerName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUploadOperation4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __525389263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUploadOperation4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50edef31fac541eeb030dc77caee9faa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUploadOperation4(ptr: Pointer?): WithDefault = IUploadOperation4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUploadOperation4 {
      val address = segment.toRawLongValue()
      return makeIUploadOperation4(Pointer(address))
    }

    public override fun toNative(obj: IUploadOperation4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__525389263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUploadOperation4): Array<IUploadOperation4?> = (elements
        as Array<IUploadOperation4?>).castToImpl<IUploadOperation4,IUploadOperation4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUploadOperation4?> =
        arrayOfNulls<IUploadOperation4_Impl>(size) as Array<IUploadOperation4?>
  }
}
