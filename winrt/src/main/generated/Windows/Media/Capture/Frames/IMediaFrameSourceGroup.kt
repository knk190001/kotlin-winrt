package Windows.Media.Capture.Frames

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameSourceGroup.ABI::class)
@Signature("{7f605b87-4832-4b5f-ae3d-412faab37d34}")
@Guid("7f605b8748324b5fae3d412faab37d34")
@WinRTInterface("7f605b8748324b5fae3d412faab37d34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceGroup.ByReference::class)
public interface IMediaFrameSourceGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_SourceInfos(): IVectorView<MediaFrameSourceInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceGroup> {
    public override fun getValue() = ABI.makeIMediaFrameSourceGroup(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceGroup {
    public val __427076885_Ptr: Pointer?

    public val _427076885_VtblPtr: Pointer?
      get() = __427076885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _427076885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__427076885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _427076885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__427076885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourceInfos(): IVectorView<MediaFrameSourceInfo?>? {
      val fnPtr = _427076885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaFrameSourceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__427076885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaFrameSourceInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __427076885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f605b8748324b5fae3d412faab37d34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceGroup(ptr: Pointer?): WithDefault =
        IMediaFrameSourceGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceGroup {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceGroup(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__427076885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceGroup): Array<IMediaFrameSourceGroup?> =
        (elements as
        Array<IMediaFrameSourceGroup?>).castToImpl<IMediaFrameSourceGroup,IMediaFrameSourceGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceGroup?> =
        arrayOfNulls<IMediaFrameSourceGroup_Impl>(size) as Array<IMediaFrameSourceGroup?>
  }
}
