package Microsoft.UI.Content

import Microsoft.UI.WindowId
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

@ABIMarker(IContentCoordinateConverterStatics.ABI::class)
@Signature("{f56374ce-b6df-5b42-a58f-4e3bb039e3a9}")
@Guid("f56374ceb6df5b42a58f4e3bb039e3a9")
@WinRTInterface("f56374ceb6df5b42a58f4e3bb039e3a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentCoordinateConverterStatics.ByReference::class)
public interface IContentCoordinateConverterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForWindowId(windowId: WindowId?): ContentCoordinateConverter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentCoordinateConverterStatics> {
    public override fun getValue() =
        ABI.makeIContentCoordinateConverterStatics(pointer.getPointer(0))

    public fun setValue(value: IContentCoordinateConverterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentCoordinateConverterStatics {
    public val __102623220_Ptr: Pointer?

    public val _102623220_VtblPtr: Pointer?
      get() = __102623220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForWindowId(windowId: WindowId?): ContentCoordinateConverter? {
      val fnPtr = _102623220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentCoordinateConverter>()
      val hr = fn.invokeHR(arrayOf(__102623220_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentCoordinateConverter>(result.getValue())
      return resultValue
    }
  }

  public class IContentCoordinateConverterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102623220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentCoordinateConverterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f56374ceb6df5b42a58f4e3bb039e3a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentCoordinateConverterStatics(ptr: Pointer?): WithDefault =
        IContentCoordinateConverterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentCoordinateConverterStatics {
      val address = segment.toRawLongValue()
      return makeIContentCoordinateConverterStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentCoordinateConverterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102623220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentCoordinateConverterStatics):
        Array<IContentCoordinateConverterStatics?> = (elements as
        Array<IContentCoordinateConverterStatics?>).castToImpl<IContentCoordinateConverterStatics,IContentCoordinateConverterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentCoordinateConverterStatics?> =
        arrayOfNulls<IContentCoordinateConverterStatics_Impl>(size) as
        Array<IContentCoordinateConverterStatics?>
  }
}
