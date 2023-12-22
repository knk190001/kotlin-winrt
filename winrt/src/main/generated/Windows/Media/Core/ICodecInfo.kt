package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICodecInfo.ABI::class)
@Signature("{51e89f85-ea97-499c-86ac-4ce5e73f3a42}")
@Guid("51e89f85ea97499c86ac4ce5e73f3a42")
@WinRTInterface("51e89f85ea97499c86ac4ce5e73f3a42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICodecInfo.ByReference::class)
public interface ICodecInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): CodecKind?

  @InterfaceMethod(1)
  public fun get_Category(): CodecCategory?

  @InterfaceMethod(2)
  public fun get_Subtypes(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun get_DisplayName(): String?

  @InterfaceMethod(4)
  public fun get_IsTrusted(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICodecInfo> {
    public override fun getValue() = ABI.makeICodecInfo(pointer.getPointer(0))

    public fun setValue(value: ICodecInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICodecInfo {
    public val __396424879_Ptr: Pointer?

    public val _396424879_VtblPtr: Pointer?
      get() = __396424879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): CodecKind? {
      val fnPtr = _396424879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CodecKind>()
      val hr = fn.invokeHR(arrayOf(__396424879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CodecKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Category(): CodecCategory? {
      val fnPtr = _396424879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CodecCategory>()
      val hr = fn.invokeHR(arrayOf(__396424879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CodecCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Subtypes(): IVectorView<String?>? {
      val fnPtr = _396424879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__396424879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayName(): String? {
      val fnPtr = _396424879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__396424879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsTrusted(): Boolean {
      val fnPtr = _396424879_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__396424879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICodecInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396424879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICodecInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51e89f85ea97499c86ac4ce5e73f3a42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICodecInfo(ptr: Pointer?): WithDefault = ICodecInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICodecInfo {
      val address = segment.toRawLongValue()
      return makeICodecInfo(Pointer(address))
    }

    public override fun toNative(obj: ICodecInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396424879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICodecInfo): Array<ICodecInfo?> = (elements as
        Array<ICodecInfo?>).castToImpl<ICodecInfo,ICodecInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICodecInfo?> = arrayOfNulls<ICodecInfo_Impl>(size)
        as Array<ICodecInfo?>
  }
}
