package Windows.Media.Import

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportSelectionChangedEventArgs.ABI::class)
@Signature("{10461782-fa9d-4c30-8bc9-4d64911572d5}")
@Guid("10461782fa9d4c308bc94d64911572d5")
@WinRTInterface("10461782fa9d4c308bc94d64911572d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportSelectionChangedEventArgs.ByReference::class)
public interface IPhotoImportSelectionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelectionEmpty(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportSelectionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPhotoImportSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportSelectionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportSelectionChangedEventArgs {
    public val __1410954105_Ptr: Pointer?

    public val _1410954105_VtblPtr: Pointer?
      get() = __1410954105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelectionEmpty(): Boolean {
      val fnPtr = _1410954105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1410954105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhotoImportSelectionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410954105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportSelectionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10461782fa9d4c308bc94d64911572d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportSelectionChangedEventArgs(ptr: Pointer?): WithDefault =
        IPhotoImportSelectionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPhotoImportSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410954105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportSelectionChangedEventArgs):
        Array<IPhotoImportSelectionChangedEventArgs?> = (elements as
        Array<IPhotoImportSelectionChangedEventArgs?>).castToImpl<IPhotoImportSelectionChangedEventArgs,IPhotoImportSelectionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportSelectionChangedEventArgs?> =
        arrayOfNulls<IPhotoImportSelectionChangedEventArgs_Impl>(size) as
        Array<IPhotoImportSelectionChangedEventArgs?>
  }
}
