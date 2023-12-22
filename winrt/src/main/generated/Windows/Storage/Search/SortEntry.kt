package Windows.Storage.Search

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
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_BOOLEAN
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Boolean
import kotlin.String
import kotlin.jvm.JvmField

@ABIMarker(SortEntry.ABI::class)
@Signature("struct(Windows.Storage.Search.SortEntry;string;b1)")
@Structure.FieldOrder("PropertyName, AscendingOrder")
@WinRTByReference(brClass = SortEntry.ByReference::class)
public open class SortEntry(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var PropertyName: String? = null

  @JvmField
  public var AscendingOrder: Boolean? = null

  public class ByReference : SortEntry(), Structure.ByReference, IByReference<SortEntry> {
    public override fun getValue(): SortEntry = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : SortEntry(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SortEntry::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      ADDRESS, 
      JAVA_BOOLEAN, 
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
