package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Uri
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

@ABIMarker(IDataPackage2.ABI::class)
@Signature("{041c1fe9-2409-45e1-a538-4c53eeee04a7}")
@Guid("041c1fe9240945e1a5384c53eeee04a7")
@WinRTInterface("041c1fe9240945e1a5384c53eeee04a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackage2.ByReference::class)
public interface IDataPackage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetApplicationLink(value: Uri?): Unit

  @InterfaceMethod(1)
  public fun SetWebLink(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataPackage2>
      {
    public override fun getValue() = ABI.makeIDataPackage2(pointer.getPointer(0))

    public fun setValue(value: IDataPackage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackage2 {
    public val __563545152_Ptr: Pointer?

    public val _563545152_VtblPtr: Pointer?
      get() = __563545152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetApplicationLink(value: Uri?): Unit {
      val fnPtr = _563545152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563545152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetWebLink(value: Uri?): Unit {
      val fnPtr = _563545152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__563545152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __563545152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("041c1fe9240945e1a5384c53eeee04a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackage2(ptr: Pointer?): WithDefault = IDataPackage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackage2 {
      val address = segment.toRawLongValue()
      return makeIDataPackage2(Pointer(address))
    }

    public override fun toNative(obj: IDataPackage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__563545152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackage2): Array<IDataPackage2?> = (elements as
        Array<IDataPackage2?>).castToImpl<IDataPackage2,IDataPackage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackage2?> =
        arrayOfNulls<IDataPackage2_Impl>(size) as Array<IDataPackage2?>
  }
}
