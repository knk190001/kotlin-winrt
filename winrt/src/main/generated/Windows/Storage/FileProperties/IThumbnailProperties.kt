package Windows.Storage.FileProperties

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IThumbnailProperties.ABI::class)
@Signature("{693dd42f-dbe7-49b5-b3b3-2893ac5d3423}")
@Guid("693dd42fdbe749b5b3b32893ac5d3423")
@WinRTInterface("693dd42fdbe749b5b3b32893ac5d3423")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThumbnailProperties.ByReference::class)
public interface IThumbnailProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OriginalWidth(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_OriginalHeight(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_ReturnedSmallerCachedSize(): Boolean

  @InterfaceMethod(3)
  public fun get_Type(): ThumbnailType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThumbnailProperties> {
    public override fun getValue() = ABI.makeIThumbnailProperties(pointer.getPointer(0))

    public fun setValue(value: IThumbnailProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThumbnailProperties {
    public val __1431752829_Ptr: Pointer?

    public val _1431752829_VtblPtr: Pointer?
      get() = __1431752829_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OriginalWidth(): WinDef.UINT {
      val fnPtr = _1431752829_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1431752829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OriginalHeight(): WinDef.UINT {
      val fnPtr = _1431752829_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1431752829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ReturnedSmallerCachedSize(): Boolean {
      val fnPtr = _1431752829_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431752829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Type(): ThumbnailType? {
      val fnPtr = _1431752829_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThumbnailType>()
      val hr = fn.invokeHR(arrayOf(__1431752829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThumbnailType>(result.getValue())
      return resultValue
    }
  }

  public class IThumbnailProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431752829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThumbnailProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("693dd42fdbe749b5b3b32893ac5d3423")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThumbnailProperties(ptr: Pointer?): WithDefault = IThumbnailProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThumbnailProperties {
      val address = segment.toRawLongValue()
      return makeIThumbnailProperties(Pointer(address))
    }

    public override fun toNative(obj: IThumbnailProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431752829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThumbnailProperties): Array<IThumbnailProperties?> =
        (elements as
        Array<IThumbnailProperties?>).castToImpl<IThumbnailProperties,IThumbnailProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThumbnailProperties?> =
        arrayOfNulls<IThumbnailProperties_Impl>(size) as Array<IThumbnailProperties?>
  }
}
