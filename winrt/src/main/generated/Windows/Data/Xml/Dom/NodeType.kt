package Windows.Data.Xml.Dom

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(NodeType.ABI::class)
@Signature("enum(Windows.Data.Xml.Dom.NodeType;i4)")
@WinRTByReference(brClass = NodeType.ByReference::class)
public enum class NodeType(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  ElementNode(1),
  AttributeNode(2),
  TextNode(3),
  DataSectionNode(4),
  EntityReferenceNode(5),
  EntityNode(6),
  ProcessingInstructionNode(7),
  CommentNode(8),
  DocumentNode(9),
  DocumentTypeNode(10),
  DocumentFragmentNode(11),
  NotationNode(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): NodeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> ElementNode
      2 -> AttributeNode
      3 -> TextNode
      4 -> DataSectionNode
      5 -> EntityReferenceNode
      6 -> EntityNode
      7 -> ProcessingInstructionNode
      8 -> CommentNode
      9 -> DocumentNode
      10 -> DocumentTypeNode
      11 -> DocumentFragmentNode
      12 -> NotationNode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NodeType> {
    public fun setValue(newValue: NodeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NodeType =
        NodeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NodeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NodeType =
        NodeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NodeType): Int = obj.value
  }
}
