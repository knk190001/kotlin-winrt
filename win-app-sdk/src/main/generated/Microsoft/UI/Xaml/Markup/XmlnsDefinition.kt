package Microsoft.UI.Xaml.Markup

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.String
import kotlin.jvm.JvmField

@ABIMarker(XmlnsDefinition.ABI::class)
@Signature("struct(Microsoft.UI.Xaml.Markup.XmlnsDefinition;string;string)")
@Structure.FieldOrder("XmlNamespace, Namespace")
@WinRTByReference(brClass = XmlnsDefinition.ByReference::class)
public open class XmlnsDefinition(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var XmlNamespace: String? = null

  @JvmField
  public var Namespace: String? = null

  public class ByReference : XmlnsDefinition(), Structure.ByReference, IByReference<XmlnsDefinition>
      {
    public override fun getValue(): XmlnsDefinition = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : XmlnsDefinition(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(XmlnsDefinition::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      ADDRESS, 
      ADDRESS, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
