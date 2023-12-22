package Microsoft.UI.Composition

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

@ABIMarker(IAnimationObject.ABI::class)
@Signature("{8f56119d-b96d-58d0-9916-d1c5e390f890}")
@Guid("8f56119db96d58d09916d1c5e390f890")
@WinRTInterface("8f56119db96d58d09916d1c5e390f890")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationObject.ByReference::class)
public interface IAnimationObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PopulatePropertyInfo(propertyName: String?, propertyInfo: AnimationPropertyInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationObject> {
    public override fun getValue() = ABI.makeIAnimationObject(pointer.getPointer(0))

    public fun setValue(value: IAnimationObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationObject {
    public val __547366230_Ptr: Pointer?

    public val _547366230_VtblPtr: Pointer?
      get() = __547366230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PopulatePropertyInfo(propertyName: String?,
        propertyInfo: AnimationPropertyInfo?): Unit {
      val fnPtr = _547366230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__547366230_Ptr, marshalToNative(propertyName),
          marshalToNative(propertyInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimationObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __547366230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f56119db96d58d09916d1c5e390f890")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationObject(ptr: Pointer?): WithDefault = IAnimationObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationObject {
      val address = segment.toRawLongValue()
      return makeIAnimationObject(Pointer(address))
    }

    public override fun toNative(obj: IAnimationObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__547366230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationObject): Array<IAnimationObject?> = (elements as
        Array<IAnimationObject?>).castToImpl<IAnimationObject,IAnimationObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationObject?> =
        arrayOfNulls<IAnimationObject_Impl>(size) as Array<IAnimationObject?>
  }
}
