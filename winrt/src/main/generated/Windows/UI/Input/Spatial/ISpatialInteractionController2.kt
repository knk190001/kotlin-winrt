package Windows.UI.Input.Spatial

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
import Windows.UI.Input.Spatial.ISpatialInteractionController.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISpatialInteractionController2.ABI::class)
@Signature("{35b6d924-c7a2-49b7-b72e-5436b2fb8f9c}")
@Guid("35b6d924c7a249b7b72e5436b2fb8f9c")
@WinRTInterface("35b6d924c7a249b7b72e5436b2fb8f9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionController2.ByReference::class)
public interface ISpatialInteractionController2 : NativeMapped, IWinRTInterface,
    ISpatialInteractionController {
  @InterfaceMethod(0)
  public fun TryGetRenderableModelAsync(): IAsyncOperation<IRandomAccessStreamWithContentType?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionController2> {
    public override fun getValue() = ABI.makeISpatialInteractionController2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionController2,
      ISpatialInteractionController.WithDefault {
    public val __1679461936_Ptr: Pointer?

    public val _1679461936_VtblPtr: Pointer?
      get() = __1679461936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetRenderableModelAsync():
        IAsyncOperation<IRandomAccessStreamWithContentType?>? {
      val fnPtr = _1679461936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamWithContentType?>>()
      val hr = fn.invokeHR(arrayOf(__1679461936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamWithContentType?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialInteractionController {
    public override val __192723522_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1679461936_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1679461936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35b6d924c7a249b7b72e5436b2fb8f9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionController2(ptr: Pointer?): WithDefault =
        ISpatialInteractionController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionController2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionController2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1679461936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionController2):
        Array<ISpatialInteractionController2?> = (elements as
        Array<ISpatialInteractionController2?>).castToImpl<ISpatialInteractionController2,ISpatialInteractionController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionController2?> =
        arrayOfNulls<ISpatialInteractionController2_Impl>(size) as
        Array<ISpatialInteractionController2?>
  }
}
