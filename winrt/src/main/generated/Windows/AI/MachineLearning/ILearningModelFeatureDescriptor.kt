package Windows.AI.MachineLearning

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

@ABIMarker(ILearningModelFeatureDescriptor.ABI::class)
@Signature("{bc08cf7c-6ed0-4004-97ba-b9a2eecd2b4f}")
@Guid("bc08cf7c6ed0400497bab9a2eecd2b4f")
@WinRTInterface("bc08cf7c6ed0400497bab9a2eecd2b4f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelFeatureDescriptor.ByReference::class)
public interface ILearningModelFeatureDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Description(): String?

  @InterfaceMethod(2)
  public fun get_Kind(): LearningModelFeatureKind?

  @InterfaceMethod(3)
  public fun get_IsRequired(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelFeatureDescriptor> {
    public override fun getValue() = ABI.makeILearningModelFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: ILearningModelFeatureDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelFeatureDescriptor {
    public val __400222983_Ptr: Pointer?

    public val _400222983_VtblPtr: Pointer?
      get() = __400222983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _400222983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__400222983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Description(): String? {
      val fnPtr = _400222983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__400222983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): LearningModelFeatureKind? {
      val fnPtr = _400222983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelFeatureKind>()
      val hr = fn.invokeHR(arrayOf(__400222983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelFeatureKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsRequired(): Boolean {
      val fnPtr = _400222983_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__400222983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILearningModelFeatureDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __400222983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelFeatureDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc08cf7c6ed0400497bab9a2eecd2b4f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelFeatureDescriptor(ptr: Pointer?): WithDefault =
        ILearningModelFeatureDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelFeatureDescriptor {
      val address = segment.toRawLongValue()
      return makeILearningModelFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__400222983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelFeatureDescriptor):
        Array<ILearningModelFeatureDescriptor?> = (elements as
        Array<ILearningModelFeatureDescriptor?>).castToImpl<ILearningModelFeatureDescriptor,ILearningModelFeatureDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelFeatureDescriptor?> =
        arrayOfNulls<ILearningModelFeatureDescriptor_Impl>(size) as
        Array<ILearningModelFeatureDescriptor?>
  }
}
