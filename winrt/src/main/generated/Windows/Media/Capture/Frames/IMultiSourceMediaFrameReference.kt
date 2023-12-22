package Windows.Media.Capture.Frames

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMultiSourceMediaFrameReference.ABI::class)
@Signature("{21964b1a-7fe2-44d6-92e5-298e6d2810e9}")
@Guid("21964b1a7fe244d692e5298e6d2810e9")
@WinRTInterface("21964b1a7fe244d692e5298e6d2810e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMultiSourceMediaFrameReference.ByReference::class)
public interface IMultiSourceMediaFrameReference : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun TryGetFrameReferenceBySourceId(sourceId: String?): MediaFrameReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMultiSourceMediaFrameReference> {
    public override fun getValue() = ABI.makeIMultiSourceMediaFrameReference(pointer.getPointer(0))

    public fun setValue(value: IMultiSourceMediaFrameReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMultiSourceMediaFrameReference, IClosable.WithDefault {
    public val __1614057036_Ptr: Pointer?

    public val _1614057036_VtblPtr: Pointer?
      get() = __1614057036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetFrameReferenceBySourceId(sourceId: String?): MediaFrameReference? {
      val fnPtr = _1614057036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReference>()
      val hr = fn.invokeHR(arrayOf(__1614057036_Ptr, marshalToNative(sourceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReference>(result.getValue())
      return resultValue
    }
  }

  public class IMultiSourceMediaFrameReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1614057036_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1614057036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMultiSourceMediaFrameReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21964b1a7fe244d692e5298e6d2810e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMultiSourceMediaFrameReference(ptr: Pointer?): WithDefault =
        IMultiSourceMediaFrameReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMultiSourceMediaFrameReference {
      val address = segment.toRawLongValue()
      return makeIMultiSourceMediaFrameReference(Pointer(address))
    }

    public override fun toNative(obj: IMultiSourceMediaFrameReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1614057036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMultiSourceMediaFrameReference):
        Array<IMultiSourceMediaFrameReference?> = (elements as
        Array<IMultiSourceMediaFrameReference?>).castToImpl<IMultiSourceMediaFrameReference,IMultiSourceMediaFrameReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMultiSourceMediaFrameReference?> =
        arrayOfNulls<IMultiSourceMediaFrameReference_Impl>(size) as
        Array<IMultiSourceMediaFrameReference?>
  }
}
